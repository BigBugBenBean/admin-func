
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ws.cds.immd.v1;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-03-22T15:10:28.098+08:00
 * Generated source version: 3.2.3
 *
 */
//
@javax.jws.WebService(
        serviceName = "EnquireTransactionGroupServiceWSImplService",
        portName = "EnquireTransactionGroupServiceWSImplPort",
        targetNamespace = "http://txgroup.cds.icons.immd/",
        wsdlLocation = "file:enquireTranGpSvc.wsdl",
        endpointInterface = "ws.cds.immd.v1.EnquireTransactionGroupServiceWS")

public class EnquireTransactionGroupServiceWSImplPortImpl implements EnquireTransactionGroupServiceWS {

    @Autowired
    RoleGroupRepository roleGroupRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    GroupFuncRepository groupFuncRepository;

    @Autowired
    FuncRepository funcRepository;

    private static final Logger LOG = Logger.getLogger(EnquireTransactionGroupServiceWSImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see ws.cds.immd.v1.EnquireTransactionGroupServiceWS#enquireAllData()*
     */
    public RoleTxgpTxidDTO enquireAllData() throws VLDExceptionException,  CoreAppExceptionException   {
        LOG.info("Executing operation enquireAllData");
        try {
            RoleTxgpTxidDTO roleTxgpTxidDTO = new RoleTxgpTxidDTO();

            List<String> roleIdList = roleGroupRepository.findAllRoleId();
            for (String roleId: roleIdList) {
                RoleTxgp roleTxgp = new RoleTxgp();
                roleTxgp.setRoleCD(roleId);
                List<String> roleGroupList = roleGroupRepository.findAllByRoleId(roleId);
                for (String groupID: roleGroupList) {
                    roleTxgp.getTxGps().add(groupID);
                }
                roleTxgpTxidDTO.getRoleTxgps().add(roleTxgp);
            }

            List<Group> groupIdDescList = groupRepository.findAll();
            for (Group group : groupIdDescList) {
                Txgp txgp = new Txgp();
                txgp.setTxGp(group.getFuncId());
                txgp.setTxGpDesc(group.getFuncDesc());
                roleTxgpTxidDTO.getTxgps().add(txgp);
            }

            List<String> funcIdList = groupFuncRepository.findAllFuncId();
            for (String funcId: funcIdList) {
                TxgpTxid txgpTxid = new TxgpTxid();
                txgpTxid.setTxGp(funcId);
                List<String> funcList = groupFuncRepository.findAllByFuncId(funcId);
                for (String groupFunc : funcList) {
                    txgpTxid.getTxids().add(groupFunc);
                }
                roleTxgpTxidDTO.getTxgpTxids().add(txgpTxid);
            }
            LOG.debug("roleTxgpTxidDTO: " + roleTxgpTxidDTO);
            return roleTxgpTxidDTO;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VLDExceptionException("VLDException_Exception...");
        //throw new CoreAppExceptionException("CoreAppException_Exception...");
    }

    /* (non-Javadoc)
     * @see ws.cds.immd.v1.EnquireTransactionGroupServiceWS#enquireTransactionGroup(java.util.List<java.lang.String> roleCdList)*
     */
    public List<TransGrpRoleDTO> enquireTransactionGroup(List<String> roleCdList) throws VLDExceptionException,  CoreAppExceptionException   {
        LOG.info("Executing operation enquireTransactionGroup");
        System.out.println(roleCdList);
        try {
            List<TransGrpRoleDTO> transGrpRoleDTO = new ArrayList<TransGrpRoleDTO>();
            for (String roleCd : roleCdList) {
                List<String> roleGroupList = roleGroupRepository.findAllByRoleId(roleCd);
                for (String roleGroup : roleGroupList) {
                    TransGrpRoleDTO roleGroupDescList = new TransGrpRoleDTO();
                    roleGroupDescList.setRoleCd(roleCd);
                    Group groupID = groupRepository.findByGroupId(roleGroup);
                    roleGroupDescList.setTxGrpId(groupID.getFuncId());
                    roleGroupDescList.setTxGrpDesc(groupID.getFuncDesc());
                    transGrpRoleDTO.add(roleGroupDescList);
                }
            }
            LOG.debug("List<TransGrpRoleDTO>: " + transGrpRoleDTO);
            return transGrpRoleDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new VLDExceptionException("VLDException_Exception...");
        //throw new CoreAppExceptionException("CoreAppException_Exception...");
    }

    /* (non-Javadoc)
     * @see ws.cds.immd.v1.EnquireTransactionGroupServiceWS#enquireTxIDsByRoleCd(java.lang.String roleCd)*
     */
    public List<Txid> enquireTxIDsByRoleCd(String roleCd) {
        LOG.info("Executing operation enquireTxIDsByRoleCd");
        try {
            List<Txid> txidList = new ArrayList<Txid>();
            List<String> groupIdList = roleGroupRepository.findAllByRoleId(roleCd);
            for (String groupID : groupIdList) {
                List<GroupFunc> groupFunc = groupFuncRepository.findAllByGroupId(groupID);
                for (GroupFunc funcIdDesc : groupFunc ) {
                    Txid txid = new Txid();
                    Func txIdDesc = funcRepository.findByFuncId(funcIdDesc.getFuncId());
                    txid.setTxid(txIdDesc.getFuncId());
                    txid.setTxidDesc(txIdDesc.getFuncDesc());
                    txidList.add(txid);
                }
            }
            LOG.debug("List<Txid>: " + txidList);
            return txidList;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

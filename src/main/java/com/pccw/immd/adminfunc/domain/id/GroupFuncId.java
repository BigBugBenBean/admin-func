package com.pccw.immd.adminfunc.domain.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupFuncId implements Serializable {

    @Column(name = "GROUP_ID", length = 16)
    private String grpId;

    @Column(name = "FUNC_ID", length = 8)
    private String funcId;

    public GroupFuncId() {

    }

    public GroupFuncId(String grpId, String funcId) {
        this.grpId = grpId;
        this.funcId = funcId;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupFuncId)) return false;
        GroupFuncId that = (GroupFuncId) o;
        return Objects.equals(getFuncId(), that.getFuncId()) &&
                Objects.equals(getGrpId(), that.getGrpId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFuncId(), getGrpId());
    }
}

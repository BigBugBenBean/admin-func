package com.pccw.immd.adminfunc.domain;


import com.pccw.immd.adminfunc.dto.AccessControlCreateDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Dell on 29/1/2018.
 */
@Entity
@Table(name = "UM_ACCESS_CONTROL_BLACK_LIST")
public class AccessControlBlackList extends AccessControl{

}

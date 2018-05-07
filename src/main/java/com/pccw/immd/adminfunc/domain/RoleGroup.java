package com.pccw.immd.adminfunc.domain;


import com.pccw.immd.adminfunc.domain.id.RoleGroupId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "UM_ROLE_GROUP")
public class RoleGroup implements Serializable {

    @EmbeddedId
    private RoleGroupId id;

    public RoleGroupId getId() {
        return id;
    }

    public void setId(RoleGroupId id) {
        this.id = id;
    }

}

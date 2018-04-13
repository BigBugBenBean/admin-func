package com.pccw.immd.adminfunc.domain;

import javax.persistence.*;

@Entity
@Table(name="UM_POST")
public class Post {

    @Id
    @Column(name="POST_ID", length = 30)
    private String postId;

//    @Column(name="ROLE_ID", length = 10)
    @JoinColumn(name="ROLE_ID")
    @ManyToOne
    private Role roleId;


    @Column(name="OFFICE_CODE", length = 10)
    private String officeCode;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
}

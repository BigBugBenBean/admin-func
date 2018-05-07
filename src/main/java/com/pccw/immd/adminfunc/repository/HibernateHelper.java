package com.pccw.immd.adminfunc.repository;

import org.springframework.beans.factory.InitializingBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Dell on 26/2/2018.
 */

public class HibernateHelper implements InitializingBean {

    @PersistenceContext ( unitName = "adminfunc")
    private EntityManager em;

    @Override
    public void afterPropertiesSet() throws Exception {
        HibernateUtils.setEntityManager(em);
    }
}

package com.pccw.immd.adminfunc.repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Dell on 26/2/2018.
 */

public class HibernateUtils  {

    private static EntityManager em;

    public static void setEntityManager(EntityManager em) {
        HibernateUtils.em = em;
    }

    public static <T> List<T> listByDomain(Class<T> clazz){
        List<T> list = null;
        Session session = em.unwrap(Session.class);

        list = session
                .createCriteria(clazz)
                .list();

        return list;
    }


    public static <T> List<T> listByDomain(Class<T> clazz, Order ... orders){
        List<T> list = null;
        Session session = em.unwrap(Session.class);

        Criteria criteria = session.createCriteria(clazz);

        if (orders != null) {
            for (Order order : orders) {
                criteria.addOrder(order);
            }
        }

        list = criteria.list();

        return list;
    }

}

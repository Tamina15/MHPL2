/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tran Minh Nhat
 */
public class main {

    static SessionFactory factory;

    public void listDepartment() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List departments = session.createQuery("FROM Department").list();
            for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
                Department employee = (Department) iterator.next();
                System.out.print("DepratmentID : " + employee.getDepartmentID());
                System.out.print("  Name: " + employee.getName());
                System.out.println("  Start Date: " + employee.getStartDate());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }
    public static void main(String args[]){
        factory = new Configuration().configure().buildSessionFactory();
        main m = new main();
        m.listDepartment();
    }
}

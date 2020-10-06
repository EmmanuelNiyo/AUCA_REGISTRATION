/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author kpeng Emmanuel
 */
public class Activities<X> {
   

    public void registerStudent(X s) {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(s);
        ss.getTransaction().commit();
        ss.close();
    }
    
    public void updateStudent(X s){
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(s);
        ss.getTransaction().commit();
        ss.close();
    }


    public void deleteStudent(X s) {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(s);
        ss.getTransaction().commit();
        ss.close();
    }

 
    public <T> X findByNationId(Class c,T t)
    {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        X x = (X) s.get(c.getClass(), s);
        return x;
    }
      

    public List<X> findAllStudent(Class cks) {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Query q = ss.createQuery(" from " + cks.getName() + " s");
        List<X> list = q.list();
        ss.close();
        return list;
    }

}

    

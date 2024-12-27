package org.example;

import com.entity.Song1;
import com.utility.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//Read the data from database
public class ReadApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Utility.getSessionFactory();
        if(sessionFactory != null) {

            Session session = sessionFactory.openSession();
            Song1 song;
            session.beginTransaction();
            song = session.get(Song1.class, 1);//Read the data
            System.out.println(song);

            session.getTransaction().commit();
            session.close();
//
//            Session session1 = sessionFactory.openSession();
//            Song1 song1;
//            session.beginTransaction();
//            song1 = session1.get(Song1.class, 1);//Read the data
//            System.out.println(song1);
//            session.getTransaction().commit();
//            session.close();
        }
    }

}
package org.example;

import com.entity.Song1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateApp {
    public static void main(String[] args) {

        //
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        //configuration.addAnnotatedClass(Song.class);//@Entity
        configuration.addAnnotatedClass(Song1.class);

        //create the session factory to get the session.And session factory build it from the xml
        SessionFactory sessionFactory = configuration.buildSessionFactory();//create it one time only

        //initialize the session object  and get the session from session factory
        Session session = sessionFactory.openSession();//create many you want

        //Creating object with filled data
        Song1 s1 = new Song1();
       // s1.setId(10); //if u are not setting the id also it will automatically take 0 as default
        s1.setSongName("hello hello hello hello");
        s1.setSinger("Shreya hjj");

        session.beginTransaction();//start to insert the data to database
        session.save(s1);
        session.getTransaction().commit();//commit the data to database
        System.out.println("saved");
        session.close();//session removed
        session.detach(s1);// object removed from the session
//
//        Session session1 = sessionFactory.openSession();
//        session1.beginTransaction();
//        session1.save(new Song1(11,"minugu tare","RK"));
//        session1.getTransaction().commit();
//        session1.close();


    }
}
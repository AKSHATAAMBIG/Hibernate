package org.example;

import com.entity.Song1;
import com.utility.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//Update the data to database
public class UpdateApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();

        if (sessionFactory != null) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Song1 song = session.get(Song1.class, 8);//get the id
            System.out.println(song);
           // song.setSongName("nee_updated");//update the only song name called dirty checking
           // session.update(song); //update the data to database
            session.getTransaction().commit();
            session.close();//detach state

              song.setSongName("nee_updated12");//session was closed before son not able to set
//            Session newsession = sessionFactory.openSession();
//            newsession.beginTransaction();
//            System.out.println(song);
//            newsession.update(song);
//            session.getTransaction().commit();

        }
    }

}
package org.example;

import com.entity.Song1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.utility.Utility;

//Delete the data from database
public class DeleteApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();
        if(sessionFactory != null) {

            Session session = sessionFactory.openSession();

            Song1 song = session.get(Song1.class, 4);// get the data
            session.beginTransaction();
            //delete the object
            session.delete(song);//delete the data
            session.getTransaction().commit();
        }
    }


}
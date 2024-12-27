package org.example;

import com.entity.Customer;
import com.entity.Student;
import com.utility.Utility;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Objects;

public class CustomerApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();
        if(sessionFactory != null) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();
//            for(int i = 1;i<20;i++){
//                Customer c = new Customer();
//                c.setCustId(i);
//                c.setCustomerName("Name"+i);
//                c.setCustomerAge(i+20);
//                session.save(c);
//            }
            /*Query q = session.createQuery("from Customer where customerAge >30 ");
            List<Customer> customer = q.list();
            for(Customer s:customer){
                System.out.println(s);
            }
            session.getTransaction().commit();*/

            /*Query q1 = session.createQuery("select from Customer where customerAge = 22 ");
            Customer customer1 = (Customer)q1.uniqueResult();
            System.out.println(customer1);
            session.getTransaction().commit();*/

            Query q1 = session.createQuery("select customerId,customerName from Customer where customerAge = 22 ");
            Objects[] customer1 = (Objects[]) q1.uniqueResult();
            System.out.println(customer1[0]+" "+customer1[1]+" "+customer1[2]);
            session.getTransaction().commit();
        }
    }
}

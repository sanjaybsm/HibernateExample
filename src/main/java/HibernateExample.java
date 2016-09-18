import common.Stock;
import org.hibernate.Session;
import persistence.HibernateUtil;

/**
 * Created by Sanjay_Shivanna on 9/18/2016.
 */
public class HibernateExample {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("4715");
        stock.setStockName("GENM");

        session.save(stock);
        session.getTransaction().commit();
    }
}

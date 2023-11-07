package in.co.rays.dicriminator;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestTablePerSubClassDiscriminator {

	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.setAmount(10);
		ccp.setCcType("VISA");

		Cash c = new Cash();
		c.setAmount(20);

		Cheque ch = new Cheque();
		ch.setAmount(50);
		ch.setBankName("CENT");
		ch.setChqNumber("CENT1");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(ccp);
		session.save(c);
		session.save(ch);

		tx.commit();

		session.close();


	}
}

package in.co.rays.inheritance;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestTablePerClass {

	public static void main(String[] args) {

		CreditCardPayment ccp = new CreditCardPayment();

		ccp.setAmount(20);
		ccp.setPaymentType("imps");
		ccp.setCcType("fixed");

		Cheque ch = new Cheque();

		ch.setAmount(30);
		ch.setPaymentType("deposite");
		ch.setBankName("CANBANk");
		ch.setChequeNumber("CANBNK100");  

		Cash c = new Cash();

		c.setAmount(40);
		c.setPaymentType("Cash");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(ccp);

		session.save(ch);

		session.save(c);

		tx.commit();

		session.close();
	}

}

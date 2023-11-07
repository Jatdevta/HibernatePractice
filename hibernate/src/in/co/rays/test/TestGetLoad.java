package in.co.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;

public class TestGetLoad {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		// UserDTO dto = (UserDTO) session.get(UserDTO.class, 2);

		UserDTO dto = (UserDTO) session.load(UserDTO.class, 2);

		System.out.println(dto);
	}

}

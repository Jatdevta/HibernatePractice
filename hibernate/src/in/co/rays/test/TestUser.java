package in.co.rays.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.dto.UserDTO;
import in.co.rays.model.UserModel;

public class TestUser {

	public static void main(String[] args) {

		// testAdd();
		// testDelete(); 
		// testUpdate();
		// testAuthenticate();
		testFindByPk();
	}

	private static void testFindByPk() {

		UserModel model = new UserModel();

		UserDTO dto = model.findByPk(1);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());

	}

	private static void testDelete() {

		UserDTO dto = new UserDTO();

		dto.setId(2);

		UserModel model = new UserModel();

		model.delete(dto);

	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Dipanshu");
		dto.setLastName("Patidar");
		dto.setLoginId("Dipanshu123@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		UserModel model = new UserModel();

		model.add(dto);

	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(5);
		dto.setFirstName("Sachin");
		dto.setLastName("Patidar");
		dto.setLoginId("sachin123@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		UserModel model = new UserModel();

		model.update(dto);

	}

	private void testSearch() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("Raj");

		UserModel model = new UserModel();

		List list = model.search(null, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());

		}

	}

	private static void testAuthenticate() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("raj123@gmail.com", "123");

		if (dto != null) {

			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("User not exist...!!!!!");
		}
	}

}

package com.sunbeam;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class A14_Q2_Main {

	@SuppressWarnings("resource")
	static int menu() {
		System.out.println("--------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new User");
		System.out.println("2. Delete given User");
		System.out.println("3. Update User");
		System.out.println("4. Display all Users");
		System.out.print("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("--------------------------------------");
		return choice;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choice;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0) {
			switch (choice) {

			case 1: {
				User user = new User();
				System.out.println("Enter User Details:");
				System.out.print("Enter First Name = ");
				user.setFirst_name(sc.next());
				System.out.print("Enter Last Name = ");
				user.setLast_name(sc.next());
				System.out.print("Enter Email = ");
				user.setEmail(sc.next());
				System.out.print("Enter Password = ");
				user.setPassword(sc.next());
				System.out.print("Enter DOB = ");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date udate;
				try {
					udate = sdf.parse(sc.next());
					user.setDate(udate);
					System.out.println("User Details Added...");
				} catch (ParseException e1) {

					e1.printStackTrace();
				}

				try (UserDao cdoa = new UserDao()) {

					System.out.println("Rows Added = " + cdoa.save(user));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				break;

			case 2:

				try {
					UserDAO cdoa = new UserDao();
					System.out.print("Enter User id to be deleted = ");
					int id = sc.nextInt();
					System.out.println(cdoa.deleteById(id) + " User Deleted...");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					UserDao cdoa = new UserDao();
					User user = new User();
					System.out.print("Enter User id to update = ");
					int id = sc.nextInt();
					user.setId(id);
					System.out.print("Enter first name = ");
					user.setFirst_name(sc.next());
					System.out.print("Enter last name = ");
					user.setFirst_name(sc.next());
					System.out.print("Enter email = ");
					user.setEmail(sc.next());
					System.out.println("Enter password = ");
					user.setPassword(sc.next());
					System.out.println("Enter Dob = ");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date udate = sdf.parse(sc.next());
					user.setDate(udate);
					System.out.println(cdoa.update(user) + " User Details Updated...");

				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ParseException e) {

					e.printStackTrace();
				}
				break;

			case 4:

				try {
					UserDao cdoa = new UserDao();
					List<User> list = new ArrayList<>();
					list = cdoa.showAll();
					list.forEach(l -> System.out.println(l));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}

		}

	}

}



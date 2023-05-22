package logbook;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<Borrower> borrowers = new ArrayList<>();

	static String adminUsername = "admin";
	static String adminPassword = "123";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. Log in as admin");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			int choice = in.nextInt();
			in.nextLine();
			if (choice == 1) {
				System.out.print("Enter username: ");
				String username = in.nextLine();
				System.out.print("Enter password: ");
				String password = in.nextLine();
				if (username.equals(adminUsername) && password.equals(adminPassword)) {
					while (true) {
						System.out.println("1. Add borrower");
						System.out.println("2. View borrowers");
						System.out.println("3. Search borrower by name");
						System.out.println("4. Delete borrower by name");
						System.out.println("5. Logout");
						System.out.print("Enter your choice: ");
						int adminChoice = in.nextInt();
						in.nextLine();
						if (adminChoice == 1) {
							System.out.print("Enter date: ");
							String date = in.nextLine();
							System.out.print("Enter time: ");
							String time = in.nextLine();
							System.out.print("Enter item: ");
							String item = in.nextLine();
							System.out.print("Enter quantity: ");
							String quantity = in.nextLine();
							in.nextLine();
							System.out.print("Enter grade level: ");
							String gradeLevel = in.nextLine();
							System.out.print("Enter section: ");
							String section = in.nextLine();
							System.out.print("Enter name: ");
							String name = in.nextLine();
							borrowers.add(new Borrower(date, time, item, quantity, gradeLevel,section, name));
							System.out.println("Borrower added successfully!");
						} 
						else if (adminChoice == 2) {
							if (borrowers.size() == 0) { 
								System.out.println("There is no borrowers for today, try anohter option");
							} 
							else { 
								for (int i = 0; i < borrowers.size(); i++) {
									System.out.println(borrowers.get(i));
								}
							} 
						}
						else if (adminChoice == 3) {
							if (borrowers.size() == 0) {
								System.out.println("Just to remind you, there is no borrowers yet");
							} else { 
								System.out.print("Enter name to search: ");
								String nameToSearch = in.nextLine();
								boolean borrowerFound = false;
								for (int i = 0; i < borrowers.size(); i++) {
									if (borrowers.get(i).getName().equals(nameToSearch)) {
										System.out.println(borrowers.get(i));
										borrowerFound = true;
									}
								}
								if (!borrowerFound) {
									System.out.println("The name of the borrower has not borrowed anything yet.");
								}
							}
						} 
						else if (adminChoice == 4) {
							System.out.print("Enter name to delete: ");
							String nameToDelete = in.nextLine();
							boolean borrowerDeleted = false;
							for (int i = 0; i < borrowers.size(); i++) {
								if (borrowers.get(i).getName().equals(nameToDelete)) {
									borrowers.remove(i);
									borrowerDeleted = true;
									break;
								}
							}
							if (borrowerDeleted) {
								System.out.println("Borrower deleted successfully!");
							} 
							else {
								System.out.println("Borrower not found.");
							}
						} 
						else if (adminChoice == 5) {
							break;
						}
					}
				} 
				else {
					System.out.println("Invalid login credentials!");
				}
			} 
			else if (choice == 2) {
				System.out.println("Thank you for using our library!");
				System.exit(0);
			} 
			else {
				System.out.println("Invalid choice!");
			}
		}
	}
}

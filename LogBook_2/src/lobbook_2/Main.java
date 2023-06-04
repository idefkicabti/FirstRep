package lobbook_2;

import java.util.Scanner;

public class Main {
	static final int MAX_BORROWERS = 1;
	static Borrower[] borrowers = new Borrower[MAX_BORROWERS];
	static int numBorrowers = 0;

	static String adminUsername = "admin";
	static String adminPassword = "123";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. Log in as admin");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			String choice = in.nextLine();
			if (choice.equals("1")) {
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
						String adminChoice = in.nextLine();

						if (adminChoice.equals("1")) {
							// Add borrower functionality
							if (numBorrowers < MAX_BORROWERS) {
								System.out.print("Enter date: ");
								String date = in.nextLine();
								System.out.print("Enter time: ");
								String time = in.nextLine();
								System.out.print("Enter item: ");
								String item = in.nextLine();
								System.out.print("Enter quantity: ");
								String quantity = in.nextLine();
								System.out.print("Enter grade level: ");
								String gradeLevel = in.nextLine();
								System.out.print("Enter section: ");
								String section = in.nextLine();
								System.out.print("Enter name: ");
								String name = in.nextLine();
								borrowers[numBorrowers] = new Borrower(date, time, item, quantity, gradeLevel, section, name);
								numBorrowers++;
								System.out.println("Borrower added successfully!");
							} 
							else {
								System.out.println("Error: Maximum number of borrowers reached!");
							}
						} 
						else if (adminChoice.equals("2")) {
							// View borrowers functionality
							if (numBorrowers == 0) {
								System.out.println("There are no borrowers yet.");
							} 
							else {
								for (int i = 0; i < numBorrowers; i++) {
									System.out.println(borrowers[i]);
								}
							}
						} 
						else if (adminChoice.equals("3")) {
							// Search borrower by name functionality
							if (numBorrowers == 0) {
								System.out.println("Just to remind you, there are no borrowers.");
							} 
							else {
								System.out.print("Enter name to search: ");
								String nameToSearch = in.nextLine();
								boolean borrowerFound = false;
								for (int i = 0; i < numBorrowers; i++) {
									if (borrowers[i].getName().equals(nameToSearch)) {
										System.out.println(borrowers[i]);
										borrowerFound = true;
									}
								}
								if (!borrowerFound) {
									System.out.println("The name of the borrower has not borrowed anything yet.");
								}
							}
						} 
						else if (adminChoice.equals("4")) {
							System.out.print("Enter name to delete: ");
							String nameToDelete = in.nextLine();
							boolean borrowerDeleted = false;
							for (int i = 0; i < numBorrowers; i++) {
								if (borrowers[i].getName().equals(nameToDelete)) {
									borrowers[i] = borrowers[numBorrowers - 1];
									numBorrowers--;
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
						else if (adminChoice.equals("5")) {
							break;
						}
					}
				} 
				else {
					System.out.println("Invalid login credentials!");
				}
			} 
			else if (choice.equals("2")) {
				System.out.println("Thank you for using our library!");
				System.exit(0);
			} 
			else {
				System.out.println("Invalid choice!");
			}
		}
	}
}
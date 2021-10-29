package com.MovieTicketBooking.app;

import java.util.Scanner;

public class BookingAccount {
	
	private final String userName;
	private final String userId;
	String bookedMovie;
	int numAdults;
	int numKids;
	int totalPrice;
		
	public BookingAccount(String userName, String userId, String bookedMovie, int numAdults, int numKids,
			int totalPrice) {
		this.userName = userName;
		this.userId = userId;
		this.bookedMovie = bookedMovie;
		this.numAdults = numAdults;
		this.numKids = numKids;
		this.totalPrice = totalPrice;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserId() {
		return userId;
	}

	void errorMessage(String message) {
		System.out.println("\n");
		System.out.println("---------------------------------------");
		System.out.println("<< Error >>");
		System.out.println(message);
		System.out.println("---------------------------------------");
		System.out.println("\n");
	}
	
	void deleteBooking() {
		bookedMovie = null;
		numAdults = 0;
		numKids = 0;
		totalPrice = 0;
	}

	void showMenu() {
		
		char option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\n");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Welcome to Movie Ticket Booking System");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("A : View Movies List");
			System.out.println("B : Get Tickets");
			System.out.println("C : Check Your Bookings");
			System.out.println("D : Quit");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(Character.toLowerCase(option)) {
				case 'a':
					System.out.println("---------------------------------------");
					System.out.println("1 : Dune");
					System.out.println("2 : No Time to Die");
					System.out.println("3 : Venom - Let There Be Carnage");
					System.out.println("4 : Last Night In Soho");
					System.out.println("5 : Antlers");
					System.out.println("6 : Ghostbusters - Afterlife");
					System.out.println("7 : Halloween Kills");
					System.out.println("8 : Encanto");
					System.out.println("9 : The Addams Family 2");
					System.out.println("10 : Eternals");
					System.out.println("---------------------------------------");
					break;
					
				case 'b':
					System.out.println("---------------------------------------");
					System.out.println("Which movie would you like to watch?");
					System.out.println("Enter the code");
					
					try {
						Scanner scForCode = new Scanner(System.in);
						int code = scForCode.nextInt();
						if (code == 1) {
							bookedMovie = "Dune";
							System.out.println("Your Movie : Dune");
						}
						if (code == 2) {
							bookedMovie = "No Time to Die";
							System.out.println("Your Movie : No Time to Die");
						}
						if (code == 3) {
							bookedMovie = "Venom - Let There Be Carnage";
							System.out.println("Your Movie : Venom - Let There Be Carnage");
						}
						if (code == 4) {
							bookedMovie = "Last Night In Soho";
							System.out.println("Your Movie : Last Night In Soho");
						}
						if (code == 5) {
							bookedMovie = "Antlers";
							System.out.println("Your Movie : Antlers");
						}
						if (code == 6) {
							bookedMovie = "Ghostbusters - Afterlife";
							System.out.println("Your Movie : Ghostbusters - Afterlife");
						}
						if (code == 7) {
							bookedMovie = "Halloween Kills";
							System.out.println("Your Movie : Halloween Kills");
						}
						if (code == 8) {
							bookedMovie = "Encanto";
							System.out.println("Your Movie : Encanto");
						}
						if (code == 9) {
							bookedMovie = "The Addams Family 2";
							System.out.println("Your Movie : The Addams Family 2");
						}
						if (code == 10) {
							bookedMovie = "Eternals";
							System.out.println("Your Movie : Eternals");
						}
					}catch(Exception e) {
						errorMessage("Non-existent code! Please retry.");
					}
					
					System.out.println("---------------------------------------");
					System.out.println("How many tickets for adults?");
					System.out.println("Enter the number");
					int inputAdults = scanner.nextInt();
					numAdults = inputAdults;
					
					System.out.println("---------------------------------------");
					System.out.println("How many tickets for kids?");
					System.out.println("Enter the number");
					int inputKids = scanner.nextInt();
					numKids = inputKids;
					
					System.out.println("---------------------------------------");
					System.out.println("Your total price will be");
					totalPrice = numAdults * 15 + numKids * 10;
					System.out.println("$"+ totalPrice);
					System.out.println("---------------------------------------");
					System.out.println("Is it OK to complete this booking?");
					System.out.println("YES -> 1, NO -> 2");
					int answer = scanner.nextInt();
					if(answer == 1) {
						System.out.println("You Got Tickets Successfully!");
						System.out.println("Thank you so much for booking :)");
					}else if(answer == 2) {
						System.out.println("Your booking is declined");
						deleteBooking();
					}else {
						errorMessage("Non-existent code! Please retry.");
					}
					break;
					
				case 'c':
					if(bookedMovie != null) {
						System.out.println("---------------------------------------");
						System.out.println("Your Booking Information");
						System.out.println("---------------------------------------");
						System.out.println("Booked Movie       : " + bookedMovie);
						System.out.println("Tickets For Adults : " + numAdults);
						System.out.println("Tickets For Kids   : " + numKids);
						System.out.println("Total Price        : $" + totalPrice);
						
						System.out.println("Would you like to delete the booking?");
						System.out.println("YES -> 1, NO -> 2");
						int answerDelete = scanner.nextInt();
						if(answerDelete == 1) {
							deleteBooking();
							System.out.println("Your booking is deleted");
						}else if(answerDelete == 2) {
							System.out.println("See you in the theatre!");
						}else {
							errorMessage("Non-existent code! Please retry.");
						}
						
					}else {
						System.out.println("---------------------------------------");
						System.out.println("No Booking Information");
						System.out.println("---------------------------------------");
					}
					break;
					
				case 'd':
					System.out.println("---------------------------------------");
					System.out.println("Bye!");
					break;
					
				default:
					System.out.println("Invalid Option! Please retry");	
					break;
			}
		}while(Character.toLowerCase(option) != 'd');
			System.out.println("Thank you for booking!");
			scanner.close();
	}
	
	

}

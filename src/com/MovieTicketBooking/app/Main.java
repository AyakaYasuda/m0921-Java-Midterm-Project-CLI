package com.MovieTicketBooking.app;

public class Main {

	public static void main(String[] args) {
		
		BookingAccount account = new BookingAccount("John", "user0000", null, 0, 0, 0);
		System.out.println("Welcome to Movie Ticket Booking System, " + account.getUserName());
		System.out.println("Your ID is " + account.getUserId());
//		System.out.println("Now you're booking " account.getBookedTickets() + "tickets");
		
		account.showMenu();
	}

}

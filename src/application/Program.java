package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder:");
		String holder = sc.next();
		System.out.print("Initial Balance:");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double withdrawLimit = sc.nextDouble();
		account = new Account(number, holder, balance, withdrawLimit);
		System.out.print("Enter amount for withdraw:");
		double withdraw = sc.nextDouble();
		sc.close();
		try {
			account.withdraw(withdraw);
			System.out.println("New Balance: " + account.getBalance());
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
	}

}

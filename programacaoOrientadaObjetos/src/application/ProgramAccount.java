package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is here an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else { /* se o usuario falou sim, chama o construtor de 3 argumentos.*/
			account = new Account(number, holder);
		}		/* se o usuario falou n�o, chama o construtor de 2 argumentos.*/
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();		
	}
}

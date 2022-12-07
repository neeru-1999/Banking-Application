package com.bankingapplication.project;

public class Banking {
	
	public static void main(String[] args) {
		
		Account acc = new Account("2347769054", "Neeraja", "neeru@gmail.com", "6309469205", 0);
		
		acc.getAccNumber();
		acc.ChangePhoneNumber("3964512045");
		acc.BalanceAmount(0);
		
		acc.DepositMoney(100);
		acc.WithdrawMoney(200);
		
	}
}

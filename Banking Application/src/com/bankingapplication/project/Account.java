package com.bankingapplication.project;

public class Account {
	
	private String AccNumber;
	private String Name;
	private String Email;
	private String PNumber;
	private double Balance;
	
	public Account(String AccNumber, String Name, String Email, String PNumber, double Balance) {
		this.AccNumber = AccNumber;
		this.Name = Name;
		this.Email = Email;
		this.PNumber = PNumber;
		this.Balance = Balance;
		
	}
	
	public void ChangePhoneNumber(String ChangePhoneNumber){
        this.PNumber+=ChangePhoneNumber;
        System.out.println("PhoneNumber changed Successful and , the new PhoneNumber is "+this.PNumber);
    }
	
	public void BalanceAmount(double balanceAmount) {
		this.Balance+=balanceAmount;
		System.out.println("Total balance Amount is " + this.Balance);
		this.Balance-=balanceAmount;
		System.out.println("Mininum Balance Amount is " + this.Balance);
	}
	
	public void DepositMoney(double DepositedMoney) {
		this.Balance = Balance+DepositedMoney;
		System.out.println("Deposit is Successfully, New Balance is "+this.Balance);
	}
	
	public void WithdrawMoney(double WithdrawMoney) {
		if(this.Balance - WithdrawMoney < 0) {
			System.out.println("withdraw successful " + this.Balance+" is left ");
		}
	}

	public String getAccNumber() {
		return AccNumber;
	}

	public void setAccNumber(String accNumber) {
		AccNumber = accNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPNumber() {
		return PNumber;
	}

	public void setPNumber(String pNumber) {
		PNumber = pNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
	

}

package com.yuvin.java.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCompose {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<User> task1 = getUserDetail("12345");
		
		CompletableFuture<String> result = task1.thenCompose(user -> getCreditScopreDetails(user));
		
		System.out.println(result.get());
		
	}
	
	// try - catch 
	
	private static CompletableFuture<User> getUserDetail(String userId) {
		return CompletableFuture.supplyAsync(() -> {
			//return UserService.getUserDetails(userId);
			return new User("Sunil Manaka", 78945);
		});	
	}
	
	
	private static CompletableFuture<String> getCreditScopreDetails(User user) {
		return CompletableFuture.supplyAsync(() -> {
			//return CreditService.getCrediScope(user);
			System.out.println(user.getName());
			System.out.println(user.getAccountNumber());
			 
			if(user.getAccountNumber() == 12345) {
			throw new IllegalArgumentException("Frud User.. Dont Give Loan.");
			}
			 
			return "Credit Scope Looks Good. Give Loan";
			  
		}).exceptionally( t ->{
			
			System.err.println(" Fraud User Found. Block the User Account \n");
			
			return " Fraud User Found. Block the User Account";
		});	
	}
	
	
	
	static class User{
		
		User(String name, int accountNumber){
			this.name = name;
			this.accountNumber= accountNumber;
		}
		
		private String name;
		
		private int accountNumber;

		public String getName() {
			return name;
		}

		public int getAccountNumber() {
			return accountNumber;
		}
		
		
		
	}
	
}

package com.yuvin.java.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCombine {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> task1 = task1();
		CompletableFuture<String> task2 = task2();
		
		CompletableFuture<String> result = task1.thenCombine(task2 , (t1, t2) ->{
			return t1+" \n"+ t2;
		});
		
		System.out.println(result.get());
		
	}
	
	private static CompletableFuture<String> task1() {
		return CompletableFuture.supplyAsync(() -> {
			return "Switch on the Water Heater";
		});	
	}

	private static CompletableFuture<String> task2() {
		return CompletableFuture.supplyAsync(() -> {
			return "Prepare BreakFast";
		});
	}
	

}

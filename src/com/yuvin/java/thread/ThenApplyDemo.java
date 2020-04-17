package com.yuvin.java.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenApplyDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Sunil Manaka";
		}).thenApply(name -> {
		    return "Hello " + name;
		}).thenApply(greeting -> {
		    return greeting + ", Welcome to the Spring Java 8";
		});

		System.out.println(welcomeText.get());
	}
}


// Call Friend
// call Hotel center - order Biryani
// Start Movie
// Watch Movie
// Enjoy Biryani + once Friend Come

//Non Block 
 // Call Friend 
// Call Hotel 

 // Wash Clothes / Wash --- / Prepare Food

// Start Movie -> Friend Come to your  
// Start Biryani



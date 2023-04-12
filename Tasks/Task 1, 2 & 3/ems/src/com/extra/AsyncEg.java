package com.extra;


import java.util.concurrent.*;
import java.util.stream.*;

public class AsyncEg {

	public static void main(String[] args) throws Exception {
		 //runAsyncMethod();
		//supplyAsyncMethod();

		//thenRunMethod();
		//thenAcceptMethod();
		//thenApplyMethod();
		//chainOfCallbackMethods();

		//thenComposeMethod();
		 //thenCombineMethod();
		//thenAcceptBothMethod();

		allOfMethod();
		//anyOfMethod();
		//handleException();
		
		Thread.sleep(10000);

	}

	private static void handleException() {
	 int age =-1;
		CompletableFuture<String> efuture = CompletableFuture.supplyAsync(() ->{
			if (age <0) {
				throw new IllegalArgumentException("Age cannot be negative");
			}
			if (age >18) {
				return "adult";
			} else {
				return "Child";
			}
			
		}).exceptionally(ex -> {
			System.out.println("OOPS !! Exception " +ex.getMessage());
			return "unknown";
			
		});
		efuture.thenAccept(System.out::println);
		
	}

	// Run background task asynchronously without returning anything
	private static void runAsyncMethod() {
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

			try {
				System.out.println("Running Async task in parallel");
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}

		});

	}

	private static void supplyAsyncMethod() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "Running Async task using suppyAsync";
		});
		future.thenAccept(System.out::println);

	}

	// Not accepting anything, not giving any output
	private static void thenRunMethod() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Deeps");
		CompletableFuture<Void> result = future.thenRun(() -> System.out.println("thenRun() is running"));
	}

	// Accepting input from future, not giving any output
	private static void thenAcceptMethod() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Deeps");
		CompletableFuture<Void> result = future.thenAccept(value -> System.out.println("Hello " + value));

	}

	// Accepting input from future , returning some output
	private static void thenApplyMethod() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "Deeps";
		});
		CompletableFuture<String> result = future.thenApply(value -> "Hello " + value);
		//future.thenAccept(System.out::println);
		result.thenAccept(System.out::println);
	}

	private static void chainOfCallbackMethods() {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "Deeps";
		}).thenApply(value -> "Hello from " + value + " !!!").thenApply(msg -> msg + " Deeps welcomes you all")
				.thenAccept(System.out::println);

	}

	private static void thenComposeMethod() {
		CompletableFuture<String> compFuture = CompletableFuture.supplyAsync(() -> "Deeps")
				.thenCompose(value -> CompletableFuture.supplyAsync(() -> "Hello from " + value));
		compFuture.thenAccept(System.out::println);
	}

	private static void thenCombineMethod() {
		CompletableFuture<String> compFuture = CompletableFuture.supplyAsync(() -> "Priya")
				.thenCombine(CompletableFuture.supplyAsync(() -> "Hello from "), (value1, value2) -> value2 + value1);
		compFuture.thenAccept(System.out::println);

	}

	private static void thenAcceptBothMethod() {
		CompletableFuture<Void> compFuture = CompletableFuture.supplyAsync(() -> "Shiva").thenAcceptBoth(
				CompletableFuture.supplyAsync(() -> "Hello from "),
				(value2, value1) -> System.out.println(value1 + value2));
	}

	private static void allOfMethod() {
		CompletableFuture<String> cFuture1 = CompletableFuture.supplyAsync(() -> "Shiva");
		CompletableFuture<String> cFuture2 = CompletableFuture.supplyAsync(() -> "Priya");
		CompletableFuture<String> cFuture3 = CompletableFuture.supplyAsync(() -> "Deeps");

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(cFuture1, cFuture2, cFuture3);

		combinedFuture.thenApply(
				v -> Stream.of(cFuture1, cFuture2, cFuture3).map(CompletableFuture::join).collect(Collectors.toList()));

		String combined = Stream.of(cFuture1, cFuture2, cFuture3).map(CompletableFuture::join)
				.collect(Collectors.joining(" "));
		System.out.println(combined);

	}

	private static void anyOfMethod() {
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "From Future1";
		});
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "From Future2";
		});
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {

			try {

				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {

				throw new IllegalStateException();
			}
			return "From Future3";
		});

		CompletableFuture<Object> anyfuture = CompletableFuture.anyOf(future1, future2, future3);
		anyfuture.thenAccept(System.out::println);

	}
	
	

}

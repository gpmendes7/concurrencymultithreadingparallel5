package com.balazcsholczer.udemy;

import java.util.concurrent.ForkJoinPool;

public class App {
	
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(220);
		pool.invoke(simpleRecursiveAction);
	}

}

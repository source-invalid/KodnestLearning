package com.kodnest.methods.overloading;

public class MethodOverloadingCalculator {
	public int calculate(int x, int y){
		return x+y;	
	}
	public int calculate(int x, int y){
		return x-y;	
	}
	public int calculate(int x, int y){
		return x*y;	
	}
	public int calculate(int x, int y){
		return x/y;	
	}
}

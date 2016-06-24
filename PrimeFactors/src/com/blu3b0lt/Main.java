package com.blu3b0lt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main exerciseStub = new Main();
        System.out.println("Enter 'n': ");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> result = exerciseStub.generate(in.nextInt());
        if(result.size() == 0) {
            System.out.println("[]");
        }
        else {
            System.out.println("Prime Factors are: ");
            for(Integer primeFactor : result) {
                System.out.println(primeFactor);
            }
        }
        return;
    }

    ArrayList<Integer> generate(int n) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        for(int counter = 2; counter <= n; counter++) {
            if((n % counter) == 0) {
                if(isPrime(counter)) {
                    result.add(counter);
                }
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        for(int counter = 2; counter < n; counter++) {
            if((n % counter) == 0) {
                return false;
            }
        }

        return true;
    }
}

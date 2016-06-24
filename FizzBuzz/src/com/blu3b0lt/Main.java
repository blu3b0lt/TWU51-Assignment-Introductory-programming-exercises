package com.blu3b0lt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main exerciseStub = new Main();
        exerciseStub.FizzBuzz(100);
        return;
    }

    public void FizzBuzz(int limit) {
        for(int counter = 1; counter <= limit; counter++) {
            boolean flag = false;
            String output = "";
            if((counter % 3) == 0) {
                output += "Fizz";
                flag = true;
            }

            if((counter % 5) == 0) {
                output += "Buzz";
                flag = true;
            }

            if(!flag) {
                output = Integer.toString(counter);
            }

            System.out.println(output);

        }

        return;
    }
}

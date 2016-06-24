package com.company;

import java.util.Scanner;

public class Main {

    private String printString;

    Main() {
        printString = "*";
    }

    Main(String aPrintString) {
        printString = aPrintString;
    }

    public static void main(String[] args) {
	// write your code here
        Main exerciseStub = new Main("*");
        while(true) {
            exerciseStub.showMenu();
            Scanner in = new Scanner(System.in);
            int option = exerciseStub.captureInput();
            switch(option) {
                case 1 : {
                    System.out.println("Output is: ");
                    exerciseStub.easiestExerciseEver();
                    break;
                }
                case 2:{
                    exerciseStub.drawHorizontalLine();
                    break;
                }
                case 3: {
                    exerciseStub.drawVerticalLine();
                    break;
                }
                case 4: {
                    exerciseStub.drawRightTriangle();
                    break;
                }

                case 5: {
                    System.exit(0);
                }
            }
        }
    }

    public void showMenu() {
        System.out.println("Welcome to Triangle Generator");
        System.out.println("Menu:\n1.Easiest Exercise Ever\n2.Draw Horizontal Line\n3.Draw Vertical Line\n4.Draw Right Triangle");
        System.out.println("5.Exit");
        System.out.print("Enter your choice: ");
        return;
    }

    public void easiestExerciseEver() {
        System.out.println(printString);
        return;
    }

    public void drawRightTriangle() {
        System.out.print("Enter 'n': ");
        int lines = captureInput();
        System.out.println("Output is: ");
        int times = 1;
        while(lines > 0) {
            String output = "";
            for(int counter = 0; counter < times; counter++) {
                output += printString;
            }
            lines--;
            times++;
            System.out.println(output);
        }
        return;
    }

    public void drawHorizontalLine() {
        System.out.print("Enter 'n': ");
        int lines = captureInput();
        System.out.println("Output is: ");
        String output = "";
        while(lines > 0) {
            output += printString;
            lines--;
        }
        System.out.println(output);
        return;
    }

    public void drawVerticalLine() {
        System.out.print("Enter 'n': ");
        System.out.println("Output is: ");
        int lines = captureInput();
        while(lines > 0) {
            System.out.println(printString);
            lines--;
        }
        return;
    }

    public int captureInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

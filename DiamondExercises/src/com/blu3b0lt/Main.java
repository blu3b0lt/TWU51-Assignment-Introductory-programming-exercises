package com.blu3b0lt;

import java.util.Scanner;

public class Main {

    private String printString;
    private String name;

    Main() {
        printString = "*";
        name = "blu3b0lt";
    }

    Main(String aPrintString, String aName) {
        printString = aPrintString;
        name = aName;
    }

    public static void main(String[] args) {
	// write your code here
        Main exerciseStub = new Main();
        while(true) {
            exerciseStub.showMenu();
            int option = exerciseStub.captureInput();
            switch (option) {
                case 1: {
                    exerciseStub.drawIsoscelesTriangle();
                    break;
                }
                case 2: {
                    exerciseStub.drawDiamond();
                    break;
                }
                case 3: {
                    exerciseStub.drawDiamondWithName();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }

    }

    public void drawDiamondWithName() {
    }

    public void drawDiamond() {
        
    }

    public void drawIsoscelesTriangle() {
        System.out.print("Enter 'n': ");
        int lines = captureInput();
        int spaces = lines - 1;
        int times = 1;
        System.out.println("Output is: ");
        while(lines > 0) {
            String output = fillSpaces(spaces);
            for(int counter = 0; counter < times; counter++) {
                output += printString;
            }
            spaces--;
            times += 2;
            lines--;
            System.out.println(output);
        }
    }

    private String fillSpaces(int spaces) {
        String spacesString = "";
        for(int counter = 0; spaces > counter; counter++) {
            spacesString += " ";
        }
        return spacesString;
    }

    public void showMenu() {
        System.out.println("Welcome to Diamond Generator");
        System.out.println("Menu");
        System.out.println("1. Draw Isosceles Triangle");
        System.out.println("2. Draw Diamond");
        System.out.println("3. Draw Diamond with name");
        System.out.println("4.Exit");
        System.out.print("Enter your Choice: ");

    }

    public int captureInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

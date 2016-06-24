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
                    System.out.print("Enter 'n': ");
                    int lines = exerciseStub.captureInput();
                    System.out.println("Output is: ");
                    exerciseStub.drawIsoscelesTriangle(lines);
                    break;
                }
                case 2: {
                    System.out.print("Enter 'n': ");
                    int lines = exerciseStub.captureInput();
                    exerciseStub.drawDiamond(lines);
                    break;
                }
                case 3: {
                    System.out.print("Enter 'n': ");
                    int lines = exerciseStub.captureInput();
                    exerciseStub.drawDiamondWithName(lines);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }

    }

    public void drawDiamondWithName(int lines) {
        drawUprightIsoscelesTriangle(lines, true);
        System.out.println(name);
        drawInvertedIsoscelesTriangle(lines - 1);
        return;
    }

    public void drawDiamond(int lines) {
        drawUprightIsoscelesTriangle(lines, false);
        drawInvertedIsoscelesTriangle(lines-1);
        return;
    }

    public void drawIsoscelesTriangle(int lines) {
        drawUprightIsoscelesTriangle(lines, false);
        return;
    }


    private void drawUprightIsoscelesTriangle(int lines, boolean skipLastLine) {
        int spaces = lines - 1;
        int times = 1;
        while(lines > 0) {
            String output = fillSpaces(spaces);
            for(int counter = 0; counter < times; counter++) {
                output += printString;
            }
            spaces--;
            times += 2;
            lines--;
            System.out.println(output);
            if(skipLastLine && lines == 1) {
                return;
            }
        }

    }

    private void drawInvertedIsoscelesTriangle(int lines) {
        int spaces = 1;
        int times = ((lines - 1) * 2) + 1;
        while(lines > 0) {
            String output = fillSpaces(spaces);
            for(int counter = 0; counter < times ; counter++) {
                output += printString;
            }
            times -= 2;
            spaces++;
            lines--;
            System.out.println(output);
        }
        return;
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
        System.out.println("4. Exit");
        System.out.print("Enter your Choice: ");

    }

    public int captureInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

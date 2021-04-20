package com.company;

import java.util.Random;

public class Matrix {
    private String name;
    private int[][] elements;


    public Matrix(String name, int numberofRows, int numberofCols) {
        this.name = name;
        elements = new int[numberofRows][numberofCols];
    }

    void RandomElements(int a, int b) {
        Random number = new Random();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] = number.nextInt(b + 1) + a;
            }
        }
    }

    @Override
    public String toString() {
        String text = "";
        text += name + "\n";

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                text += String.format("%6d", elements[i][j]);
            }
            text += "\n";
        }
        return text;
    }


    public void swapElements(Matrix other) {
        if (this.elements.length == other.elements.length &&
                this.elements[3].length == other.elements[3].length) {
            for (int i = 0; i < elements.length; ++i) {
                for (int j = 0; j < elements[i].length; j++) {
                    if (i < j) {
                        int temp = elements[i][j];
                        this.elements[i][j] = other.elements[i][j];
                        other.elements[i][j] = temp;
                    }
                }
            }
        } else {
            System.out.println("not valid");
        }
    }

    public void printArray(Matrix matrix) {
        for (int i = 0; i < elements.length; ++i) {
            for (int j = 0; j < elements[0].length; ++j) {
                System.out.println(matrix);
            }
            
        }
    }
}






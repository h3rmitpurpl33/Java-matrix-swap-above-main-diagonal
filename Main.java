package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix matrixA = new Matrix("Matrix A", 4, 4);
        Matrix matrixB = new Matrix("Matrix B", 4, 4);

        matrixA.RandomElements(-10, 10);
        matrixB.RandomElements(-10, 10);


        System.out.println(matrixA.toString());
        System.out.println(matrixB.toString());


        matrixB.swapElements(matrixA);
        matrixB.printArray(matrixB);

        matrixA.swapElements1(matrixA);
        matrixA.printArray(matrixA);



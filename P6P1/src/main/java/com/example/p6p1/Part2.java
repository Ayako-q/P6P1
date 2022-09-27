package com.example.p6p1;

import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        inputArray();
        System.out.println("Now lets create array filled with random int" +
                "\n What size will it be? :");
        int sizeRandArr = GetInt();
        createRandomArray(sizeRandArr);
        arrSum(inputArray());
        biggestNum(inputArray());
    }

    public static int[] inputArray() //1. Input Array Method
    {
        System.out.println("What will be our length of array?");
        int arrayLength = GetInt();
        int[] arr = new int[arrayLength];
        int i = 0;
        while (i < arrayLength) {
            System.out.println(arrayLength - i + " left");
            arr[i] = GetInt();
            i++;
        }
        System.out.println("Done, here it is:");
        printArray(arr);
        return arr;
    }
    //2.Create an array with random values method
    public static int[] createRandomArray(int arrSize)
    {
        int[] array = {};
        array = new int[arrSize]; //user can choose size of array
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100); //fill array with numbers below 100
        }
        System.out.println("Done, here it is:");
        printArray(array);
        return array;
    }
    //3. Print Array Method
    public static void printArray(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
            System.out.print(inputArray[i] + " ");
        System.out.println();
    }
    //4. Sum of array elements
    public static int arrSum(int[] inputArray)
    {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            sum += inputArray[i];
        }
        System.out.println("Sum of this array is: " + sum);
        return sum;
    }
    //5. Largest value in an array
    public static int biggestNum(int[] inputArray)
    {
        int a = inputArray.length - 1;
        for(int i = 0; i < a;)
        {
            if(inputArray[i] > inputArray[i+1])
            {
                    inputArray[i+1] = inputArray[i];
            }
            i++;
        }
        System.out.println("Biggest number in this array is: " + inputArray[a]);
        return a;
    }
    public static int GetInt() //method to get users input as an int
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }
}

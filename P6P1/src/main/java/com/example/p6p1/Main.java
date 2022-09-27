package com.example.p6p1;

public class Main {
    public static void main(String[] args) {
        //Demonstrating array creation:
        int size = 10;
        int[] array1 = new int[10]; //array with length of 10
        int[] array2 = new int[size]; //array with length defined in a variable
        int[] array3 = {5, 2, 22, 124, 4, 0, 3, 1}; //literal array creation
        boolean[] arrayBool = {true, false, false, true, false}; //array of booleans
        double[] arrayDoubl = {0.444444, 0.124534, 2.45637, 1.456789}; //array of doubles
        var arrayStr = new String[]{"Hi ", "my name ", "is ", "Oleksii ", "Ishchenko"}; //array of Str
        int a = array3.length; //demonstrating use of .length
        System.out.println("Length of array3 is " + a);
        //Set and access array elements by index:
        array3[1] = 43; //Assign new value to second array element
        System.out.println("Second element value: " + array3[1]); //Print array element value
        //System.out.println(array3[789345]); Trying ro reach array element by non-existing index
        System.out.println("Lets use for loop to traverse an array.");
        for (int i = 0; i < a; ) //Use for loop to traverse an array.
        {
            System.out.println(array3[i]);
            i++;
        }
        System.out.println("Now using enhanced for loop");
        for (int value : array3) // Use enhanced for loop to traverse an array.
        {
            System.out.println(value);
        }
        int i = 0;
        System.out.println("Now using while loop");
        while (i < a) // Using while loop to traverse an array.
        {
            System.out.println(array3[i]);
            i++;
        }
    }
}
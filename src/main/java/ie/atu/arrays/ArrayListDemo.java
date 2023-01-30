package ie.atu.arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter a new number:");
            myList.add(input.nextInt());
            loop(myList);
        }
        catch(ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("***We went outside of our of allocated memory space***\n" + aiob);
        }
    }

    public static void loop(ArrayList<Integer> someArrayList)
    {
        int indexvalue = 0;
        for (int value: someArrayList)
        {
            System.out.println("Element at index " + indexvalue +": " + value);
            indexvalue++;
        }
    }
}

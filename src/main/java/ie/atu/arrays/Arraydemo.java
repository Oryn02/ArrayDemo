package ie.atu.arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Arraydemo {

    public static void main(String[] args) {

        int[] array1;
        int i,g;
        array1 = new int[10];

        Scanner input = new Scanner(System.in);

        for(g = 0;g<=10;g++){
            try {
                System.out.println("Please enter a number:");
                array1[g] = input.nextInt();
            }
            catch(ArrayIndexOutOfBoundsException aiob)
            {
                System.out.println("***index 10 not filled as there is not enough space***\n");
            }
        }


        for(i = 0; i<10; i++) {
            System.out.println("element at index " + i + ": " + array1[i]);
        }

    }
}

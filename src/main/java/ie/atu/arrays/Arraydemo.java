package ie.atu.arrays;

public class Arraydemo {

    public static void main(String[] args) {

        int[] array1;
        int i;
        array1 = new int[10];

        array1[0] = 100;
        array1[1] = 200;
        array1[2] = 300;
        array1[3] = 400;
        array1[4] = 500;
        array1[5] = 600;
        array1[6] = 700;
        array1[7] = 800;
        array1[8] = 900;
        array1[9] = 1000;

        for(i = 0; i<10; i++) {
            System.out.println("element at index " + i + ": " + array1[i]);
        }

    }
}

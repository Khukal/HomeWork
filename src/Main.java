import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("задача 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i : weight){
            System.out.println(i);}

        double[] doubleArr = {1.57, 7.654, 9.986};
for (double i:doubleArr){
    System.out.println(i);}
        int[] massiv = {90, 91, 93};
        for (int i : massiv){
            System.out.println(i);}
        //task 2
        System.out.println("задание 2");
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println(doubleArr[0] + "," + doubleArr[1] + "," + doubleArr[2]);
        System.out.println(Arrays.toString(massiv));
        //task 3
        System.out.println("задание 3");
        for (int i=2;i<weight.length && i>=0;i--) {
            System.out.println(weight[i]);
            if (i > 0) {
                System.out.println(",");
            }
        }
        for (int i=doubleArr.length-1; i>=0;i--) {
            System.out.println(doubleArr[i]);
            if (i > 0) {
                System.out.println(",");
            }
        }
        for (int i=2;i<massiv.length && i>=0;i--) {
            System.out.println(massiv[i]);
            if (i > 0) {
                System.out.println(",");
            }
        }
        System.out.println("задание 4");
        for (int index = 0; index < weight.length; index++) {
            if (weight[index] % 2 != 0) {
                weight[index] = weight[index] + 1;
            }
        }
        for (int index = 0; index < weight.length; index++){
            System.out.println(weight[index] +" ");}
    }
    }



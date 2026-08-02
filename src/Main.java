public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("задача 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};

        int[] massiv = {90, 91, 93};
        //task 2
        System.out.println("задание 2");
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println(doubleArr[0] + "," + doubleArr[1] + "," + doubleArr[2]);
        System.out.println(massiv[0] + "," + massiv[1] + "," + massiv[2]);
        //task 3
        System.out.println("задание 3");
        System.out.println(weight[2] + "," + weight[1] + "," + weight[0]);
        System.out.println(doubleArr[2] + "," + doubleArr[1] + "," + doubleArr[0]);
        System.out.println(massiv[2] + "," + massiv[1] + "," + massiv[0]);
        //task 4
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



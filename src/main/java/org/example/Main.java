package org.example;

public class Main {
    public static void main(String[] args) {
//        arithmeticEx(10,0);
//        indexBoundEx(10);
//        numberFormatEx(5);

        double [] arr_1 = {3,6,5,2,6,7};
        double [] arr_2 = {5,7,2,1,8,5};
        int n = arr_1.length;
        double [] arr_3 = new double[n];
        arrayDifference(arr_1,arr_2,arr_3);   // разность чисел массива
//        arrayDivision(arr_1,arr_2,arr_3);   // деление чисел массива
    }

    public static void arithmeticEx(int a, int b){
        if(b == 0){
            throw new RuntimeException("На ноль делить нельзя");
        }
        System.out.println(a/b);
    }

    public static void indexBoundEx(int a){
        int [] array = new int[a];
        if(a < a + 1){
            throw new RuntimeException("Такого элемента нет в массиве");
        }
        System.out.println(array[a + 1]);
    }

    public static void numberFormatEx(int a){
        int [] array = new int[a];
        array[0] = Integer.parseInt("test");
    }

//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
//    в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static String arrayDifference(double [] arr_1, double [] arr_2, double [] arr_3){
        String info = "Длины массива не равны";
        if (arr_1.length != arr_2.length){
            System.out.println(info);
        }
        else{
            for (int i = 0; i < arr_1.length; i ++){
                arr_3[i] = arr_1[i] - arr_2[i];
                System.out.println(Math.round(arr_3[i]));
            }
        }
        return info;
    }

    public static int checkArrayLength (int [] arr_1, int [] arr_2, int [] arr_3){
        int arr_3_length;
        if (arr_1.length > arr_2.length){
            arr_3_length = arr_1.length;
        } arr_3_length = arr_2.length;
        return arr_3_length;
    }

    /*
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
     * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
     * в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
     * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
     * т.е. ваше.
     */

    public static String arrayDivision(double[] arr_1, double[] arr_2, double[] arr_3){
        String info = "Длины массива не равны";
        if (arr_1.length != arr_2.length){
            throw new RuntimeException(info);
        }
        else{
            for (int i = 0; i < arr_1.length; i ++){
                arr_3[i] = arr_1[i] / arr_2[i];
                System.out.println(arr_3[i]);
            }
        }
        return info;
    }


}



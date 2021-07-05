package ru.geekbrains.homework2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456asd"}};

        String[][] arr2 = new String[][]{
                {"12", "234", "145", "23", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"}};

        String[][] arr3 = new String[][]{
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"},
                {"12", "234", "145", "2456"}};

        try {
            sumOfArrays.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {

        }

        try {
            sumOfArrays.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sumOfArrays.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
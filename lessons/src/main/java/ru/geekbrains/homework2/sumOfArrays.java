package ru.geekbrains.homework2;

public class sumOfArrays {
    public static int sum(String[][] arr) {
        if (arr.length != 4) throw new MyArraySizeException("I need 4x4 array only!");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != 4) throw new MyArraySizeException("I need 4x4 array only!");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Not a number at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum is :" + sum);return sum;
    }
}

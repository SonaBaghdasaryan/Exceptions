// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
// получить?

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Random;

// import javax.management.RuntimeErrorException;

// /**
// * HomeWork1
// */
// public class HomeWork1 {

// public static void main(String[] args) {
// String[] myArray = { "first str", null, "third str" };
// final int[] array = { 15, 1, 3, 7, 4, 3, 8, 6, 3, 9 };
// division(15, 6);
// printValue(array, 9);
// printStringArr(myArray);
// }

// public static void division(double firstNum, double secondNum) {
// if (secondNum == 0)
// throw new ArithmeticException("На ноль делить нельзя!!!");
// double result = firstNum / secondNum;
// System.out.printf("Результат деления %f на %f равен %f.\n", firstNum,
// secondNum, result);
// }

// public static void printValue(int[] array, int index) {
// if (index > array.length - 1)
// throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не
// существует");
// else
// System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
// }

// public static void printStringArr(String[] myArray) {
// for (String item : myArray) {
// if (item == null)
// throw new NullPointerException("Элемент отсутствует!");
// System.out.println(item);
// }
// }
// }

// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя.
// /**
// * HomeWork1
// */
// public class HomeWork1 {

// public static void main(String[] args) {
// int[] array1 = { 3, 5, 1, 7, 4, 9 };
// int[] array2 = { 4, 6, 7, 2, 1 };
// System.out.println(diffArray(array1, array2));
// }

// public static ArrayList<Integer> diffArray(int[] array1, int[] array2) {
// int j = 0;
// int val;
// ArrayList<Integer> result = new ArrayList<Integer>();
// if (array1.length != array2.length) {
// throw new RuntimeErrorException(null, "Массивы имеют различный размер");
// } else {
// while (j < array1.length) {

// val = array1[j] - array2[j];
// result.add(val);
// j++;

// }
// }
// return result;

// }
// }

// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих
// массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя
// /**
// * HomeWork1
// */
// public class HomeWork1 {

// public static void main(String[] args) {
// int[] array1 = { 8, 3, 6, 1 };
// int[] array2 = { 6, 2, 9, 7 };

// System.out.println(Arrays.toString(method(array1, array2)));

// }

// public static int[] method(int[] arr1, int[] arr2) {
// if (arr1.length != arr2.length) {
// throw new RuntimeException("Массивы имеют различный размер");

// }

// int[] array = new int[arr1.length];
// for (int i = 0; i < arr1.length; i++) {
// if (arr2[i] == 0) {

// throw new RuntimeException("На ноль делить нельзя!");

// }
// array[i] = arr1[i] / arr2[i];

// }
// return array;

// }

// }

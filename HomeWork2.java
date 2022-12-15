import java.io.FileNotFoundException;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.Reader;

// public class HomeWork2 {
// public static void main(String[] args) {
// float userVal = getFloatVal();
// System.out.println();
// System.out.println("You entered the following number:");
// System.out.println(userVal);
// }

// static float getFloatVal() {
// float val = 0;
// boolean status = true;
// while (status) {
// InputStream UserInput = System.in;
// Reader inputReader = new InputStreamReader(UserInput);
// System.out.println("Input some float value:");
// BufferedReader bufferedReader = new BufferedReader(inputReader);
// try {
// val = Float.parseFloat(bufferedReader.readLine());
// status = false;
// } catch (IOException | NumberFormatException exception) {
// System.out.println("User input is not number. Or there is any IO problem. Try
// again!");
// // exception.printStackTrace();
// }
// }
// return val;
// }
// }

// /**
// * HomeWork2
// */
// public class HomeWork2 {

// private static int[] intArray;

// public static void main(String[] args) {
// try {
// int d = 0;
// double catchedRes1 = intArray[8] / d;
// System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
// System.out.println("Catching exception: " + e);
// }
// }
// }

// /**

// * HomeWork2
// */
// public class HomeWork2 {
// public static void main(String[] args) throws Exception {
// try {
// int a = 90;
// int b = 3;
// System.out.println(a / b);
// System.out.println(23);
// int[] abc = { 1, 2 };
// abc[3] = 9;
// } catch (Throwable ex) {
// System.out.println("Что-то пошло не так...");
// }
// }
// }

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.Reader;

// /**
// * HomeWork2
// */
// public class HomeWork2 {

// public static void main(String[] args) {
// String userVal = getVal();
// System.out.println();
// System.out.println("You entered the following string:");
// System.out.println(userVal);
// }

// static String getVal() {
// String val = "";
// System.out.println("Input your string:");
// InputStream UserInput = System.in;
// Reader inputReader = new InputStreamReader(UserInput);
// BufferedReader bufferedReader = new BufferedReader(inputReader);
// try {
// val = bufferedReader.readLine();
// if (val.isBlank()) {
// throw new IllegalArgumentException("Blank lines are prohibited!");
// }
// } catch (IOException exception) {
// System.out.println("There are some IO problems.");
// // exception.printStackTrace();
// }
// return val;
// }
// }

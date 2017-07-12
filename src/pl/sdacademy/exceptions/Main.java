package pl.sdacademy.exceptions;

/**
 * Created by RENT on 2017-07-11.
 */
public class Main {
    public static void main(String[] args) {
//        int[] intArray = new int[3];
//        try {
//            System.out.println(intArray[5]);   //pomija drugi wyjatek bo lapie pierwszy i odrazu elci dalej
//            int a = 5 / 0;
//
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Tresc wyjactku arrayoutofboundexception: " + e.getMessage());
//
//        } catch (ArithmeticException e) {
//            System.out.println("Tresc wiadomosci wyjatku ArithmeticException: " + e.getMessage());
//        }
//
//        System.out.println("Kod wywolany po instrukcjacj ze skladni try/catch");
//        System.out.println(divide(4, 2));
//        System.out.println(divide(4, 0));

        int[] myArray = {0,2,3,4,5,6,};

        System.out.println(zadanie2(myArray, 52, 1));

    }

    public static Integer divide(int int1, int int2) {       //zadanie1
        try {
            return  (int1 / int2);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Treść wiadomości wyrzuconego " +
                    "wyjątku: " +
                    e.getMessage());
            return null;
        }

    }


    public static Integer zadanie2 (int[] intArray, int firstIndex, int secondIndex){

        try {
            firstIndex = intArray[firstIndex-1];
            secondIndex = intArray[secondIndex-1];
            return  firstIndex/secondIndex;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }


}

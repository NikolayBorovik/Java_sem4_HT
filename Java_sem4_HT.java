package Java_Seminar4.Java_sem4_HT;

import java.security.DrbgParameters.Reseed;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Java_sem4_HT {
    public static void main(String[] args) {
        // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
        // порядке и каждый из их узлов
        // содержит одну цифру.
        // 1) Умножьте два числа и верните произведение в виде связанного списка.
        // 2) Сложите два числа и верните сумму в виде связанного списка.
        // Одно или два числа могут быть отрицательными.
        // Даны два Deque, цифры в обратном порядке.
        // [3,2,1] - пример Deque
        // [5,4,3]- пример второго Deque
        // 1) 123 * 345 = 42 435
        // Ответ всегда - связный список, в обычном порядке
        // [4,2,4,3,5] - пример ответа

        Deque<Integer> deque1 = getDeque(3);
        Deque<Integer> deque2 = getDeque(3);
        System.out.println(deque1);
        System.out.println(deque2);

        // System.out.println(Multiply(deque1, deque2));
        System.out.println(Sum(deque1, deque2));       
      

    }

    public static Deque<Integer> getDeque(int num) {
        Deque<Integer> deque = new ArrayDeque<>();
        Random rand = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0, 10);
        }
        for (int i : arr) {
            deque.add(i);
        }
        return deque;
    }

    public static LinkedList<String> Multiply(Deque<Integer> deque1, Deque<Integer> deque2) {
        LinkedList<String> ll = new LinkedList<>();
        int[] arr = new int[deque1.size()];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = deque1.pop();
        }
        String temp = Arrays.toString(arr).replace(" ", "").replace(",", "").replace("[", "").replace("]", "");
        int num1 = Integer.parseInt(temp);
        // System.out.println(num1);


        int[] arr2 = new int[deque2.size()];
        for (int i = arr2.length-1; i >= 0; i--) {
            arr2[i] = deque2.pop();
        }
        String temp2 = Arrays.toString(arr2).replace(" ", "").replace(",", "").replace("[", "").replace("]", "");
        int num2 = Integer.parseInt(temp2);
        // System.out.println(num2);

        int res = num1 * num2;
        // System.out.println(res);

        String str = "" + res;
        // System.out.println(str);

        String[]arr3 = new String[str.length()];
        arr3 = str.split("");
        

        for (String i : arr3) {
            ll.add(i);
        }
        return ll;
    }

    public static LinkedList<String> Sum (Deque<Integer> deque1, Deque<Integer> deque2) {
        LinkedList<String> ll = new LinkedList<>();
        int[] arr = new int[deque1.size()];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = deque1.pop();
        }
        String temp = Arrays.toString(arr).replace(" ", "").replace(",", "").replace("[", "").replace("]", "");
        int num1 = Integer.parseInt(temp);
        // System.out.println(num1);


        int[] arr2 = new int[deque2.size()];
        for (int i = arr2.length-1; i >= 0; i--) {
            arr2[i] = deque2.pop();
        }
        String temp2 = Arrays.toString(arr2).replace(" ", "").replace(",", "").replace("[", "").replace("]", "");
        int num2 = Integer.parseInt(temp2);
        // System.out.println(num2);

        int res = num1 + num2;
        // System.out.println(res);

        String str = "" + res;
        // System.out.println(str);

        String[]arr3 = new String[str.length()];
        arr3 = str.split("");
        

        for (String i : arr3) {
            ll.add(i);
        }
        return ll;
    }
}

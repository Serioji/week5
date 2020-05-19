import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class NumbersFormation {
    public static int[] array = {};
    public static String[] array1 = {};


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
            if(i<0 || i>10000) {
                System.out.println("Невалидно число");

            }

        }
        for (int element : myArray) {
            System.out.print(element + " ");

        }
        PrimaryMenu(array);





    }
    public static void PrimaryMenu(int[] array){
        System.out.println("Изберете Опция");
        System.out.println("1.Работа с числа");
        System.out.println("2.Работа с думи");
        System.out.println("3.Изход от програмата");
        Scanner menu = new Scanner(System.in);
        int number = menu.nextInt();



        if(number == 1){
            System.out.println("1.Работа с числа");
            Menu1(array);
            NumbersWork(array);

        }
        if(number == 2){
            System.out.println("Работа с думи");
            Menu1(array);
            WordsWork(array);
        }


    }

    public static void Menu1(int[] array){
        System.out.println("Изберете Опция");
        Scanner menu = new Scanner(System.in);
        int number = menu.nextInt();

        if (number == 1){
            System.out.println("1.Работа с числа");
            System.out.println("Изберете опция от числата");
            System.out.println("1.Извеждане само на простите числа от масива");
            System.out.println("2. Извеждане на най-често срещан елемент в масива");
            System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива");
            System.out.println("4. Извеждане на максимална редица от намаляващи елементи в масива");
            System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива");
            System.out.println("6. Извеждане на последователност от числа от масива, които имат сума\n" +
                    "равна на число, генерирано на случаен принцип");
            System.out.println("7. Връщане назад към основното меню");
            NumbersWork(array);





        }
        if (number == 2){
            System.out.println("2.Работа с думи");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length of String array");
            int n=sc.nextInt();
            String[] array1=new String[n];
            for(int i =0; i<n;i++){
                System.out.println("enter the "+(i+1)+" String :");
                array1[i]=sc.next();
                for(String s:array1){
                    System.out.println(s);
                   {


                    }
                }

            }

        }
        if (number == 3){
            System.out.println("Exit");

        }


    }
    public static void WordsWork(int[] array){
        System.out.println("Изберете Опция");
        Scanner menu = new Scanner(System.in);
        int number = menu.nextInt();
        System.out.println("Изберете Опция");
        if(number == 1){
            System.out.println("1. Обърнете буквите на думите от масива наобратно и ги\n" +
                    "визуализирайте в конзолата");
            reverseString(array,6,5);
        }
        if(number == 2){
            System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в\n" +
                    "масива");
        }
        if(number == 3){
            System.out.println("3. Изведете броя на символите за всяка една от думите в масива");
        }
        if (number == 4) {
            System.out.println("4. Изведете броя на повтарящите се думи от масива");
        }
        if (number == 5){
            System.out.println("5. Връщане назад към основното меню");
            PrimaryMenu(array);
        }
    }
    public static void NumbersWork(int[] array) {
        System.out.println("Изберете Опция");
        Scanner menu = new Scanner(System.in);
        int number = menu.nextInt();

        if (number == 1) {
            System.out.println("1.Извеждане само на простите числа от масива");
            PrimeNumber(array);
        }
        if (number == 2) {
            System.out.println("2. Извеждане на най-често срещан елемент в масива");
            MostFrequent(array);

        }
        if (number == 3) {
            System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива");
            Growing(array);
        }
        if (number == 4) {
            System.out.println("4. Извеждане на максимална редица от намаляващи елементи в масива");
            Desending(array);

        }
        if (number == 5) {
            System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива");
            Repeating(array);

        }
        if (number == 6) {
            System.out.println("6. Извеждане на последователност от числа от масива, които имат сума\n" +
                    "равна на число, генерирано на случаен принцип");

        }
        if (number == 7) {
            System.out.println("7. Връщане назад към основното меню");
            PrimaryMenu(array);

        }

    }
    static void reverseString(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseString(arr, start+1, end-1);
    }
    public static void PrimeNumber(int[] MyArray){
        for(int i=2; i<MyArray.length;i++){
            for(int j=2;j<=i;j++){
                if(j==i){
                    System.out.println(i);
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }
    public static void MostFrequent(int[] MyArray)
    {
        int n = MyArray.length;
        int max_count = 1, res = MyArray[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (MyArray[i] == MyArray[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = MyArray[i - 1];
                }
                curr_count = 1;
            }
        }

        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = MyArray[n - 1];
        }
    }
    public static int Growing(int[] MyArray){
        int result = MyArray.length;
        for (int i=0; i<MyArray.length; i++) MyArray[i] = i+1;
        return result;
    }
    public static void Repeating(int[] MyArray){
        boolean b = true;
        int temp = -1;
        for(int i = 0; i < MyArray.length; i++){

            if(!b){
                System.out.print(temp + " ");
            }

            b = true;
            temp = MyArray[i];
            for(int j = 0; j < MyArray.length; j++){
                if(i != j && temp == MyArray[j] && MyArray[j] != -2){
                    b = false;
                    MyArray[j] = -2;
                }
            }
        }
        }
    public static void Desending(int[] myArray) {
        int max = 1, len = 1, maxIndex = 0;
        for (int i = 1; i < myArray.length; i++)
        {
            if (myArray[i] < myArray[i-1])
                len++;
            else
            {
                if (max < len)
                {
                    max = len;
                    maxIndex = i - max;
                }
                len = 1;
            }
        }
        if (max < len)
        {
            max = len;
            maxIndex = myArray.length - max;
        }
        for (int i = maxIndex; i < max+maxIndex; i++)
            System.out.print(myArray[i] + " ");
    }
    }



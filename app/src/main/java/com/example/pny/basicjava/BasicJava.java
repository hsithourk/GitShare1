package com.example.pny.basicjava;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by PNY on 6/9/2018.
 */

public class BasicJava {
    public static void main(String args[]){
        //String myString = "My Name is :";
        //String myName = "Sithourk";
        //System.out.println(myString.concat(myName));

        //LowerCase
        String myString = "I love Java Programming";
        String result;
        result = myString.toLowerCase();
        System.out.print(result);

        //Count the length
        int length = myString.length();
        System.out.println(" My String length is: "+ length);

        //split it by space
        String data[] = myString.split(" ");
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[3]);

        for (int c=0;c>data.length;c++) {
            System.out.println("Split" + data[c]);
        }
        //Sub String
        System.out.println("Sub String: " + myString.substring(7,11));


        //Reverse
       // StringBuilder sb = new StringBuilder();
        //sb.append(myString);
       // sb = sb.reverse();
       // System.out.println(sb);
        System.out.println(StringUtils.reverse(myString));

        //Array
        double[] myNumber = {3.2,9.1,8,5,5.2,6.1};
        for (int i=0;i<myNumber.length;i++) {
            System.out.println("My Array "+ myNumber[i]);

        }
    }
}

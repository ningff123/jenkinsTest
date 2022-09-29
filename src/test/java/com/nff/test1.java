package com.nff;

import org.testng.annotations.Test;

import java.util.Arrays;

public class test1 {
    @Test
    public void sort(){
        char arr[]=new char[]{'B','d','a','C'};
        System.out.println("转换前的顺序"+arr);
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                arr[i]=Character.toLowerCase(arr[i]);
                System.out.println("转换成小写"+arr[i]);
            }else {
                arr[i]=Character.toUpperCase(arr[i]);
                System.out.println("转换成大写"+arr[i]);
            }
        }
        Arrays.sort(arr);
        for(char ss:arr){
            System.out.println("转换后的顺序"+ss);
        }
//        //System.out.println("转换后的顺序"+arr);
    }


    public static String exChange(String str){

        StringBuffer sb = new StringBuffer();

        if(str!=null){

            for(int i=0;i<str.length();i++){

                char c = str.charAt(i);

                if(Character.isUpperCase(c)){

                    sb.append(Character.toLowerCase(c));

                }else if(Character.isLowerCase(c)){

                    sb.append(Character.toUpperCase(c));

                }

            }

        }

        return sb.toString();

    }
}

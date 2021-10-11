package work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        String str="AbC051FED326HYZ";

        String str1="4507ADBCD543";

        System.out.println("divideStringSorting(str) = " + divideStringSorting(str));
        System.out.println("divideStringSorting(str1) = " + divideStringSorting(str1));

    }


    public static String sort(String a){

        char[] chars = a.toUpperCase().toCharArray();
        Arrays.sort(chars);
        String str=new String(chars);
        return str;

    }

    public static String divideStringSorting(String str){

        List<String> strings=new ArrayList<>();
        String dumy="";
        int k=0;
        List<Integer> index=new ArrayList<>();
        for (int i = 0; i < str.length()-1; i++) {

            if (Character.isLetter(str.charAt(i))&Character.isDigit(str.charAt((i+1)))||(Character.isLetter(str.charAt(i+1))&Character.isDigit(str.charAt((i))))){
                index.add(i);
            }

        }

        dumy=str.substring(0, index.get(0)+1);
        for (int i = 0; i < index.size()-1; i++) {
            dumy+="-"+str.substring(index.get(i) + 1, index.get(i + 1) + 1);
        }
        dumy+="-"+str.substring(index.get(index.size()-1)+1);

        String [] strings1=dumy.split("-");
        String sorted="";
        for (int i = 0; i < strings1.length; i++) {

            sorted+=sort(strings1[i]);

        }
        return sorted;

    }
}

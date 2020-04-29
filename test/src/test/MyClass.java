package test;

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = Sc.nextLine();
        String t = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                t+=s.charAt(i);

            }
        }
        int n = Integer.parseInt(t);
        System.out.println(n);

    }
}
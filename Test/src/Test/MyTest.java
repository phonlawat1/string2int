package Test;
import java.util.Scanner;

public class MyTest {
	public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = Sc.nextLine();
        String t = "";
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                t += s.charAt(i);

            }
            
        }
        
        int output = t.chars().reduce(0, (a, b) -> 10 * a + b - '0');
        
        System.out.println(output);
        
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Subtask4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int n=0;
        System.out.println("Введіть число: ");
        Scanner sc = new Scanner(System.in);
        try {
            n = sc.nextInt();

        } catch (InputMismatchException fg)
        {
            System.out.print("Ви не ввели число!" );
        }

        char [] numbers = String.valueOf(n).toCharArray();
        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
}
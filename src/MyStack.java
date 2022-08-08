import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int index = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(index);
        for (int i = 0; i < index; i++) {
            System.out.println("Nhập vào phần tử");
            int a = scanner.nextInt();
            stack.push(a);
        }
        System.out.println("Mảng ban đầu: " + stack);
        for (int i = 0; i < index; i++) {
            arr.add(stack.pop());
        }
        System.out.println("Mảng sau khi đổi: " + arr);
    }
}
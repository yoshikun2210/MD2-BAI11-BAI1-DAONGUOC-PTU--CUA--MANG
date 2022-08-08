import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class WStack {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String mWord = scanner.nextLine();
        String[] list = mWord.split("");

        for (int i = 0; i < list.length; i++) {
            wStack.push(list[i]);
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            list[i] = wStack.pop();
        }
        System.out.println(list);
    }
}
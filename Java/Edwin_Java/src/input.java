import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); //trim事输入的空白删除
        System.out.println("You are "+ name);
    }
}

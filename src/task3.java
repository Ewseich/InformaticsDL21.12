import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), up = 0;
        int[] arr = new int[n];
        int questions = (int) Math.ceil(Math.log(n) / Math.log(2));
        System.out.println(questions);

    }
}
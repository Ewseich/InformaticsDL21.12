import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrn = new int[n], arrk = new int[k];
        for (int i = 0; i < n; i++) {
            arrn[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            arrk[i] = sc.nextInt();
            int minint = Integer.MAX_VALUE, left = 0, right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arrn[mid] <= arrk[i]) {
                    left = mid + 1;
                }
                else if (arrn[mid] > arrk[i]) {
                    right = mid - 1;
                }
            }

            System.out.print(minint + " ");
        }
    }
}

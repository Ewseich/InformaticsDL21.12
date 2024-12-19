import java.util.Scanner;
public class task4 {
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
            int breaker = -1, left = 0, right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arrn[mid] == arrk[i]) {
                    breaker = 1;
                    break;
                }
                if (arrn[mid] > arrk[i]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            if (breaker == -1) {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}

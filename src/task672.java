import java.util.Scanner;
public class task672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(), left = 1, right = 0, breaker = -1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > right) {
                right = arr[i];
            }
        }
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2, res = 0;
            for (int i = 0; i < n; i++) {
                res += arr[i] / mid;
            }
            if (res >= k) {
                result = mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        System.out.println(result);

    }
}

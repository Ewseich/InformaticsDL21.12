import java.util.Scanner;
public class task111728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrsort = new int[n];
        for (int i = 0; i < n; i++) {
            arrsort[i] = sc.nextInt();
        }
        int[] arr = new int[m];
        int first = -1, last = -1;
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            first = -1;
            last = -1;
            int left = 0, right = n - 1;
            while (left <= right){
                int mid = (left + right) / 2;
                if (arrsort[mid] > arr[i]){
                    right = mid - 1;
                }
                else if (arrsort[mid] < arr[i]){
                    left = mid + 1;
                }
                else {
                    first = mid;
                    right = mid - 1;
                }
            }
            left = 0 ;
            right = n - 1;
            while (left <= right){
                int mid = left + (right - left) / 2;
                if (arrsort[mid] > arr[i]){
                    right = mid - 1;
                }
                else if (arrsort[mid] < arr[i]){
                    left = mid + 1;
                }
                else {
                    last = mid;
                    left = mid + 1;
                }
            }
            if (first == -1){
                System.out.println(0);
            }
            else System.out.println((1 + first) + " " + (1 + last));

        }
    }
}

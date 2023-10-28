package lab01;

import java.util.Scanner;;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập độ dài cảu mảng
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        System.out.println("Enter array of length " + n);
        int[] arr = new int[n];
        double sum=0; // biến lưu tổng của các phần tử trong mảng
        // vòng lặp để nhập n phần tử của mảng
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i]; // tính tổng
        }

        // sắp xếp mảng
        for (int i = 0; i < n - 1; i++){
            for (int j = i; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // in mảng đã sắp xếp
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum: " + sum); // in tổng
        System.out.println("Average: " + sum/5); // in trung bình cộng của các phần tử trong mảng
        sc.close();
    }
}
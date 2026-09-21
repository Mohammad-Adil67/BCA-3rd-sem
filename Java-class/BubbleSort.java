import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
     public static void main(String[] args) {
        System.out.println("===BCA Java Bubble sort===");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of elements to be sorted= ");
        int size=sc.nextInt();

        int[]numbers= new int[size];

         System.out.println("Enter "+ size + " integers separated by spaces or enters: ");
        for(int i=0;i<size;i++){
            System.out.println("Element " + (i+1) + ": ");
            numbers[i]= sc.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(numbers));

        sort(numbers);

        System.out.println("Sorted Array: "+ Arrays.toString(numbers));

        sc.close();
    }
}
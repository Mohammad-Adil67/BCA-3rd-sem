import java.util.Scanner;

public class mul_table {
    public static void generate_table(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter the number for generating multiplication table: ");
        int num=sc.nextInt();
        
        generate_table(num);
        sc.close();
    }
}

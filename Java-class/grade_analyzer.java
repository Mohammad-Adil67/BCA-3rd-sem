import java.util.Scanner;

public class grade_analyzer {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("-----BCA Student Marks Analyzer-----");
        
        double[] marks= new double[5];
        double total=0;

        for(int i=0;i<5;i++){
            System.out.println("Enter the marks of subject" + (i+1) + ":");
            marks[i]=sc.nextDouble();
            total=total+marks[i];
        }

        double avg=total/5;

        double highest = marks[0];

        for(int i=1;i<5;i++){
            if(marks[i]>highest){
                highest=marks[i];
            }
        }

        System.out.println("----Performance Report----");
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Average Percentage:" + avg + "%");
        System.out.println("Highest Score:" + highest);

        if(avg>=40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        sc.close();
    }
}

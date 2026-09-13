import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word or a sentence: ");
        String text = sc.next();

        String vowels = "aeiouAEIOU";
        int vowel_count=0;

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);

            if(vowels.indexOf(ch)!= -1){
                vowel_count++;
            }

        }

        Boolean is_palindrome =true;
        int start=0;
        int end=text.length() - 1;

        while(start<end){
            if(Character.toLowerCase(text.charAt(start)) != Character.toLowerCase(text.charAt(end))){
                is_palindrome=false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("No. of vowels: " + (vowel_count));
        if(is_palindrome){
            System.out.println("It is a Palindrome!");
        }
        else{
            System.out.println("It is not a Palindrome!");
        }
        sc.close();
    }
}

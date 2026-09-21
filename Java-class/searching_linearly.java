public class searching_linearly{
    public static void linearSearch(int[] arr,int elem){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elem){
                System.out.println("Element found at index: "+i);
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("===Linear Search===");

        int[] arr = {23,54,65,78,51,89,46};
        int elem=51;

        linearSearch(arr,elem);
        
    }
}

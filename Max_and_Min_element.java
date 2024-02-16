public class Main {
    public static void main(String[] args) {
      
        int arr[] = {20, 40,50,60};
        int length = arr.length;
         int max= arr[0], min = arr[0];
        for(int i=1; i< length; i++){
            // finding max element in array
            if(max < arr[i]){
                max = arr[i];
            }
             if(min > arr[i]){
                min = arr[i];
            }
            
        }
        System.out.println(max + " " + min);
    }
}


/********Finding maxminum two elements in array*******/

public class Main {
    public static void main(String[] args) {
      
        int arr[] = {20, 60,50,60};
        int length = arr.length;
         int first= arr[0], second = arr[0]; 
        int i=1;
        for( i=1; i< length; i++){
            // finding max element in array
            if(first < arr[i])
                first = arr[i];
            
        }
            for( i =1; i< length; i++){
                if(second < arr[i] && first <= arr[i]){
                second = arr[i];
            }  
            }
           
            
        
        System.out.println(second + " " + first);
    }
}

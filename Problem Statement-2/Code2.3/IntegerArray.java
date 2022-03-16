public class IntegerArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }
        
        arr[15]=sum;
//        calculating average value of array
        arr[16]=sum/15;
        
//        computing smallest element in an array
        int size=arr.length;
        int temp;
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
               if(arr[i]>arr[j]){
                   temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
         }
        arr[17]=arr[0];
        System.out.println("Sum of all the elements of an array: " + arr[15]); 
        System.out.println("Average of all elements in an array is : "+arr[16]);
        
        System.out.println("the smallest element in an array is : "+arr[17]);
        
        
    }  
}  
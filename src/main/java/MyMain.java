import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        
        int length = list.size(); 
        
        for (int i = 1; i < length; i++) { 
            int temp = list.get(i); 
            int j = i-1; 

            while (j >= 0 && list.get(j) > temp) { 
                
                list.set(j+1, list.get(j));
                j = j-1; 
            } 

            list.set(j+1, temp);
        } 
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int length = arr1.length; 
        int[] arr = new int[length*2];

        int arr1Num = 0;
        int arr2Num = 0;
        int i = 0;

        for (i = 0; arr2Num < length && arr1Num < length; i++){
            
            if(arr1[arr1Num] > arr2[arr2Num]){
                arr[i] = arr2[arr2Num];
                arr2Num++;

            }else{
                arr[i] = arr1[arr1Num];
                arr1Num++;

            }
        }

        if (arr1Num == length){
            for (int j = arr2Num; j < length; j++){
                arr[i] = arr2[j];
                i++;
            }
        }
        else{
            for (int j = arr1Num; j < length; j++){
                arr[i] = arr1[j];
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}

// import java.util.*;

public class Sorts {
    public static void bubbleSort(int arr[]){
      int n = arr.length-1;
      for(int turn = 0; turn < n; turn++){
        
        for(int j = 0; j < n-turn; j++){
          if(arr[j] > arr[j+1]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;   
          }
        }
      }
    }

   

    // OPTIMIZED CODE FOR BUBBLE SORT

// public static void optimized(int arr[]){
//   int n = arr.length-1;
//   for(int turn = 0; turn < n; turn++){
//     boolean Swapped = false;
//       for(int j = 0; j < n-turn; j++){
//         if(arr[j] > arr[j+1]){
//           //swap
//           int temp = arr[j];
//           arr[j] = arr[j+1];
//           arr[j+1] = temp;
//           Swapped = true;
//         }
//       }

//       if(Swapped == false){
//         break;
//       }
//     }
//   }

    public static void selectionSort(int arr[]){
      int n = arr.length;
      for(int i = 0; i < n-1; i++){
        int minPos = i;
        for(int j = i+1; j < n; j++){
          if(arr[minPos] > arr[j]){
            minPos = j;
          }
        }
        //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
      }
    }

   
   public static void insertionSort(int arr[]){
    int n = arr.length;
    for(int i = 1; i < n; i++){
      int curr = arr[i];
      int prev = i - 1;
      //finding out the correct pos to insert
      while(prev >= 0 && arr[prev] > curr){
        arr[prev+1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev+1] = curr;
    }
   }


   public static void countingSort(int arr[]){
     int largest = Integer.MIN_VALUE;
     for(int i = 0; i < arr.length; i++){
       largest = Math.max(largest, arr[i]); 
     }

     int count[] = new int[largest+1];
     for(int i = 0; i < arr.length; i++){
        count[arr[i]] = count[arr[i]]+1; //count[arr[i]]++;
     }

     //Sorting
     int j = 0;
     for(int i = 0; i < count.length; i++){
      while(count[i] > 0){
        arr[j] = i;
        j++;
        count[i]--;
      }
     }
   }

  
  
 public static void printArr(int arr[]){
      for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

  public static void main(String[] args) {
    int arr[] = {1,4,1,3,2,4,3,7};
    //bubbleSort(arr);
    // selectionSort(arr);
    // insertionSort(arr);
    //Arrays.sort(arr,Collections.reverseOrder());
    countingSort(arr);
    printArr(arr);
  }
}

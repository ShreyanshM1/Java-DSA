public class Sorted_And_Rotated_Array_Search {

  public static int search(int arr[],int tar, int si, int ei){
    //base case 
    if(si > ei){
      return -1;
    }

    //kaam
    int mid = si + (ei - si)/2;
    if(arr[mid] == tar){
      return mid;
    }

     
    //mid on L1
    if(arr[si] <= arr[mid]){
      // case 1
      if(tar >= arr[si] && tar <= arr[mid]){
        return search(arr, tar, si, mid-1);
      } 
      // case 2
      else{
        return search(arr, tar, mid+1, ei);
      }
    }

    
    //mid on L2
    else{
      // case 3
      if(tar >= arr[mid] && tar <= arr[ei]){
        return search(arr, tar, mid+1, ei);
      } 
      // case 4
      else{
        return search(arr, tar, si, mid-1);
      }
    }

  }

  public static int searchLoops(int arr[], int tar, int si, int ei){
    //kaam
    while (si <= ei) {
      int mid = si + (ei - si)/2;
      //found
      if(tar == arr[mid]){
        return mid;
      }
   
      //left part 
      if(arr[si] <= arr[mid]){
        if(tar <= arr[mid] && tar >= arr[si]){
           ei = mid - 1;
        } else{
           si = mid + 1;
        }
      }
      //right part
      else{
        if(tar <= arr[ei] && tar > arr[mid]){
          si = mid + 1;
        } else{
          ei = mid - 1;
        }
      }
    }
    return -1;
  }
   public static void main(String[] args) {
    int arr[] = {5,6,7,8,0,1,2};
    int target = 4;
    int tarIdx = search(arr,target,0,arr.length-1);
    System.out.println(tarIdx);
   }
  
}
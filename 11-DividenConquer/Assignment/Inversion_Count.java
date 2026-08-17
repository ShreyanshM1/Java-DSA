package Assignment;

//Optimized Approach
public class Inversion_Count {
  //T.C. ––> O(nxlog(n))
  //S.C. ––> O(n)

  public static int mergeSort(int arr[],int si, int ei){
    //base case
    if(si >= ei){
      return 0;
    }
    int mid = si + (ei - si)/2;
    int leftInvCount = mergeSort(arr, si, mid);
    int rightInvCount = mergeSort(arr, mid+1, ei);
    int invCount = merge(arr,si,mid,ei);

    return leftInvCount+rightInvCount+invCount;
  }

  public static int merge(int arr[],int si, int mid, int ei){
    int inversionCount = 0;
    int temp[] = new int[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;

    while (i <= mid && j <= ei) {
      if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
      } else{
        inversionCount += (mid-i+1); 
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    while(i <= mid){
      temp[k++] = arr[i++];
    }
    while(j <= ei){
      temp[k++] = arr[j++];
    }

    for(k=0,i=si;k< temp.length; k++,i++){
       arr[i] = temp[k];
    }
    return inversionCount;
  }

  public static void main(String[] args) {
    // int arr[] = {6,3,5,2,7};
    int arr[] = {1,3,5,10,2,6,8,9};
    System.out.println(mergeSort(arr,0,arr.length-1));
  } 
}

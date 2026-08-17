package Assignment;

public class Majority_Element {

  //Brute Force Approach

  public static int majorityElement(int nums[]){
    int majorityCount = nums.length/2;
    for(int i = 0; i < nums.length; i++){
      int count = 0;
      for(int j = 0; j < nums.length; j++){
        if(nums[i] == nums[j]){
          count++;
        }
      }
      if(count > majorityCount){
        return nums[i];
      }
    }
    return -1;
  }

//Optimized Majority Element Solution
//T.C = O(n)
//S.C = O(1)

public static int majorityElementOptimized(int nums[]){
  int n = nums.length;
  int majority = nums[0];
  int count = 1;
  for(int i = 1; i < n; i++){
    if(nums[i] == majority){
       count++;
    } else{
      count--;
      if(count == 0){
        majority = nums[i];
        count = 1;
      }
    }
  }
  return majority;
}

  public static void main(String[] args) {
    int nums[] = {1,2,3,4};
    System.out.println(majorityElementOptimized(nums));
  }
}

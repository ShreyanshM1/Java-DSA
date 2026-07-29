public class Assignment {
  public static boolean identical(int nums[]){
   for(int i = 0; i < nums.length; i++){
      for(int j = i+1; j < nums.length; j++){
        if(nums[i] == nums[j]){
          return true;
        }
      }
   }
   return false;
  }

  public static int maxProfit(int prices[]){
   int buyPrice = prices[0];
   int profit = 0;

   for(int i = 1; i < prices.length; i++){
    if(buyPrice < prices[i]){
      profit = Math.max(prices[i] - buyPrice, profit);
    } else{
      buyPrice = prices[i];
    }
   }
   return profit;
  }

  public static int trap(int height[]){
    int n = height.length;
    int res = 0, l = 0, r = n - 1;
    int rMax = height[r], lMax = height[l];

    while(l < r){
      if(lMax < rMax){
        l++;
        lMax = Math.max(height[l], lMax);
        res += lMax - height[l];
      } else{
        r--;
        rMax = Math.max(rMax, height[r]);
        res += rMax - height[r];
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int nums[] = {1,2,3,4,5};
    int prices[] = {7,1,5,3,6,4};
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(identical(nums));
    System.out.println(maxProfit(prices));
    System.out.println(trap(height));
  }
}

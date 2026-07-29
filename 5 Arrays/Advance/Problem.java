
public class Problem {
  public static int trappedRainwater(int height[]){
    int n = height.length;
    // calculate left max boundary - array
    int leftmax[] = new int[n];
    leftmax[0] = height[0];
    for(int i = 1; i < n; i++){
      leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }

    //calculate right max boundary - array
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int i = n-2; i >= 0; i--){
      rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for(int i = 0; i < n; i++){
      //waterLevel => min(leftmax bound, rightmax bound)
     int waterLevel = Math.min(leftmax[i],rightmax[i]);

     //trapped water => waterLevel - height[i]
     trappedWater += waterLevel - height[i];
    }
   return trappedWater;
  }

  // public static int buyAndSellStocks(int prices[]){
  //   int maxProfit = 0;
  //   int buyPrice = Integer.MAX_VALUE;

  //   for (int i = 0; i < prices.length; i++){
  //     if(buyPrice < prices[i]){   //profit
  //       int profit = prices[i] - buyPrice;   // today's profit
  //       maxProfit = Math.max(maxProfit, profit);
  //     } else{
  //       buyPrice = prices[i];
  //     }
  //   }
  //   return maxProfit;
  // }

  public static int buyAndSellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i < prices.length;i++){
      if(buyPrice < prices[i]){
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else{
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }
  
  public static void main(String[] args) {
    int height[] = {4,2,0,4,6};
    int prices[] = {7,1,5,3,6,4};
    System.out.println(trappedRainwater(height));
    System.out.println(buyAndSellStocks(prices));
  }
}

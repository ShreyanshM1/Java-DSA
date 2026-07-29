public class Matrices {

  public static int diagonalSum(int matrix[][]){  //O(n^2)
    // int n = matrix.length;
    // int m = matrix[0].length;
    // int sum = 0;
    // for(int i = 0; i < n; i++){
    //   for(int j = 0; j < m; j++){
    //     if(i == j){
    //      sum += matrix[i][j]; 
    //     }
    //     else if(i+j == n-1){
    //       sum += matrix[i][j];
    //     }
    //   }
    // }
    // return sum;
    
    int n = matrix.length;
    int sum = 0;
    for(int i = 0; i < n; i++){  //O(n)
      // pd
      sum += matrix[i][i];
      //sd
      if(i != n-1-i){  // n-i-1 == j
        sum += matrix[i][n-1-i];
      }
    }
    return sum;
  }


  public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while(startRow <= endRow && startCol <= endCol){
      //top
      for(int j = startCol; j <= endCol; j++){
        System.out.print(matrix[startRow][j]+" ");
      }

      //right
      for(int i = startRow+1; i <= endRow; i++){
        System.out.print(matrix[i][endCol]+" ");
      }

      //bottom
      for(int j = endCol-1; j >= startCol ; j--){
        if(startRow == endRow){
          break;
        }
        System.out.print(matrix[endRow][j]+" ");
      }

      //left
      for(int i = endRow-1; i >= startRow+1; i--){
        if(startCol == endCol){
          break;
        }
        System.out.print(matrix[i][startCol]+" ");
      }
      startCol++;
      startRow++;
      endCol--;
      endRow--;
    }
    System.out.println();
  }


  public static boolean stairCaseSearch(int matrix[][],int key){
    int row = 0, col = matrix[0].length-1;
    
    while(row < matrix.length && col >= 0) {
      if(matrix[row][col] == key){
        System.out.println("Found key at (" + row + "," + col + ")");
        return true;
      }

      else if(key < matrix[row][col]){
        col--;
      }

      else{
        row++;
      }
    }
    System.out.println("key not found");
    return false;
  }

  

  // public static boolean stairCaseSearch(int matrix[][], int key){
  //   int row  = matrix.length-1, col = 0;
    
  //   while(col <= matrix[0].length-1 && row >= 0){

  //     if(matrix[row][col] == key){
  //       System.out.print("Key found at ("+row+","+col+")");
  //       return true;
  //     }

  //     else if (key < matrix[row][col]){
  //       row --;
  //     }

  //     else{
  //       col++;
  //     }
  //   }
  //   System.out.println("Key not found");
  //   return false;
  // }

  

  public static void main(String[] args) {
    int matrices[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
    printSpiral(matrices);
    System.out.println(diagonalSum(matrices));
  
    int matrix[][] = {{10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
    int key = 30;
    stairCaseSearch(matrix, key);
  }
}
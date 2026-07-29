public class Assignment {
  public static int countNumber(int array[][],int number){
    int count = 0;
   for(int i = 0; i < array.length; i++){
    for(int j = 0; j < array[0].length ; j++){
      if(array[i][j] == number){
        count++;
      }
    }
   }
   return count;
  }

public static int secondRowSum(int nums[][],int row){
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    for(int j = 0; j < nums[0].length; j++){
      if(i == row){
        sum += nums[i][j];
      }
    }
  }
  return sum;
}

  // public static void main(String[] args) {
  //   int array[][] = {
  //                    {4,7,8},
  //                    {8,8,7}
  //                   };
  //   int number = 7;
  //   int nums[][] = {
  //                   {1,4,9},
  //                   {11,4,3},
  //                   {2,2,3}
  //                  };
  //   int matrix[][] ={
  //                    {1,2,3},
  //                    {4,5,6}
  //                   };
  //   System.out.println(countNumber(array, number));
  //   System.out.println(secondRowSum(nums,2));
  // }


  public static void main(String[] args) {
    int row = 2, col = 3;
    int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

    printMatrix(matrix);

    int transpose[][] = new int[col][row];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        transpose[j][i] = matrix[i][j];
      }
    }
    printMatrix(transpose);
  }

  public static void printMatrix(int matrix[][]){
    System.out.println("The matrix is: ");
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        System.out.println(matrix[i][j]+"  ");
      }
      System.out.println();
    }
  }
}

import java.util.*;
public class Intro {

  public static void largestAndSmallest(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        largest = Math.max(largest, matrix[i][j]);
        smallest = Math.min(smallest,matrix[i][j]);
      }
    }
    System.out.println("Largest element in 2-D Array is "+largest);
    System.out.println("Smallest element in 2-D Array is "+smallest);
  }


  public static boolean search(int matrix[][],int key){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(matrix[i][j] == key){
          System.out.print("found at cell ("+i+","+j+")");
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[3][3];
    int n = matrix.length;
    int m = matrix[0].length;

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }

    //Output

    for(int i = 0; i < m; i++){
      for(int j = 0; j < m; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }

    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(j == 2){
          System.out.println("Column 3 elements are :"+matrix[i][j]);
        }
      }
    }
    search(matrix, 5);
    System.out.println();
    largestAndSmallest(matrix);
  }
}

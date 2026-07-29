
// public class intro {
//   public static void main(String[] args) {
  //   int marks[] = new int[100];

  //  Scanner sc = new Scanner(System.in);

  //  System.out.println("length of array = " + marks.length);

  //  marks[0]= sc.nextInt(); //phy 
  //  marks[1]= sc.nextInt(); //chem
  //  marks[2]= sc.nextInt(); //maths

  //  System.out.println("phy : "+marks[0]);
  //  System.out.println("chemistry : "+marks[1]);
  //  System.out.println("maths : "+marks[2]);
   
  //  //percentage
  //  int percentage = (marks[0]+marks[1]+marks[2]) / 3;
  //  System.out.println("percentage = "+percentage+"%"); 

// }
// }



// public class intro {
//   public static void update(int marks[]){
//     for(int i = 0; i < marks.length; i++){
//       marks[i]+=1;//marks[i]++
//     }
//   }
//   public static void main(String[] args) {
//     int marks[] = {97,98,99};
//     update(marks);

//     //print our marks
//     for(int i = 0; i < marks.length; i++){
//       System.out.print(marks[i]+"  ");
//     }
//     System.out.println();
//   }
// }



//Largest and Smallest number in an array


// public class intro {
//   public static int getLargest(int numbers[]){
//     int largest = Integer.MIN_VALUE; // - infinity
//     int smallest = Integer.MAX_VALUE; // + infinity
//     for(int i = 0; i < numbers.length; i++){
//       if(largest < numbers[i]){
//         largest = numbers[i];
//       }
//       if(smallest > numbers[i]){
//         smallest = numbers[i];
//       }
//     }
//     System.out.println("smallest value is : "+smallest);
//     return largest;
//   }

//   public static void main(String[] args) {
//     int numbers[] = {1,2,6,3,5};
//     System.out.println("largest value is : "+getLargest(numbers));
//   }
// }



//Reverse an Array 

// public class intro{

//   public static void reverse(int numbers[]){
//     int first = 0,last = numbers.length-1;
//     while(first < last){
//       //swap
//       int temp = numbers[last];
//       numbers[last] = numbers[first];
//       numbers[first] = temp;

//       first++;
//       last--;
//     }
//   }
//   public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     reverse(numbers);
//     for(int i = 0; i < numbers.length; i++){
//       System.out.print(numbers[i]+" ");
//     }
//     System.out.println();
//   }
// }



//Second Largest Element 

// public class intro {
//   public static int secondLargest(int nums[]){
//     int largest = Integer.MIN_VALUE;
//     int secondLargest = 0;
//     for(int i = 0; i < nums.length; i++){
//       if(largest < nums[i]){
//         largest = nums[i];
//       }
//     } 
//     for(int i = 0; i < nums.length; i++){
//       if (nums[i] > secondLargest && nums[i] != largest) {
//         secondLargest = nums[i];
//       }
//     } 
//    return secondLargest;
//   }
//   public static void main(String[] args) {
//     int nums[] = {2,4,6,12,8,10};
//     System.out.println(secondLargest(nums));
//   }
// }


public class Intro {

  public static void getSecondLargest(int numbers[]){
   int largest = Integer.MIN_VALUE;
   int secondLargest = 0;
   for(int i = 0; i < numbers.length; i++){
    if(largest < numbers[i]){
      largest = numbers[i];
    }
   }
   for(int i = 0; i < numbers.length; i++){
    if(numbers[i] < largest && secondLargest < numbers[i]){
      secondLargest = numbers[i];
     }
   }

   System.out.println("Second Largest Element from the array is "+secondLargest);
  }
  public static void main(String[] args) {
    int numbers[] = {2,4,6,8,12,10};
    getSecondLargest(numbers);
  }
}
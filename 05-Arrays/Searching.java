
//public class Searching{
//   public static int linearSearch(int numbers[],int key){
//     for(int i = 0; i < numbers.length; i++){
//       if(numbers[i] == key){
//         return i;
//       } 
//     }
//     return -1;
//   }

//   public static int linearSearch(String menu[], String key2){
//     for(int i = 0; i < menu.length; i++){
//       if(menu[i]==key2){
//         return i+1;
//       }
//     }
//     return -1;
//   }

  
//   public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,12,14,16};
//     String menu[] = {"dosa","chole bhature","samosa"};
//     String key2 = "samosa";
//     int key = 20;
//     int index2 = linearSearch(menu, key2);
//     if(index2 == -1){
//       System.out.println("NOT FOUND");
//     } else {
//       System.out.println("key is at place: "+index2);
//     }

//     int index = linearSearch(numbers, key);
//     if(index == -1){
//       System.out.println("NOT FOUND");
//     } else {
//       System.out.println("key is at index: "+index);
//     }
//   }
//}

public class Searching {

  public static int binarySearch(int numbers[], int key){
    int start = 0, end = numbers.length-1;

    while(start <= end){
      int mid = (start+end)/2;

      if(numbers[mid] == key){
        return mid;
      }
      if(numbers[mid] < key){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10,12,14};
    int key = 10;
    System.out.println("index for key is : "+binarySearch(numbers, key));
  }
}



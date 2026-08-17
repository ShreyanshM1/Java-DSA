// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class questions {
  public static void reversePrint(ArrayList<Integer> list){
    //O(n)
    for(int i = list.size()-1; i >= 0; i--){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();
  }

  public static void maxNumber(ArrayList<Integer> list){
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < list.size(); i++){
      // if(list.get(i) > max){
      //   max = list.get(i);
      // }
      max = Math.max(max, list.get(i));
    }
    System.out.println("Max Element -> "+max);
  }

  public static void swap2Numbers(ArrayList<Integer> list, int idx1,int idx2){
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2,temp);
  }

  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(3);
    // list.add(6);


    // reversePrint(list);
    //maxNumber(list);
    // System.out.println(list);
    // swap2Numbers(list,1,3);
    // System.out.println(list);

    //Sorting in ArrayList
    // System.out.println(list);
    // Collections.sort(list); //ascending
    // System.out.println(list);

    // //descending
    // Collections.sort(list, Collections.reverseOrder());
    // //Comparator - fnx logic
    // System.out.println(list);

    //Multi-dimensional 2D Array
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    for(int i = 1; i <= 5; i++){
      list1.add(i*1);
      list2.add(i*2);
      list3.add(i*3);
    }

    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    list2.remove(3);
    list2.remove(2);

    System.out.println(mainList);

    for(int i = 0; i < mainList.size(); i++){
      ArrayList<Integer> currList = mainList.get(i);
      for(int j = 0; j < currList.size(); j++){
        System.out.print(currList.get(j)+" ");
      }
      System.out.println();
    }
  }
}

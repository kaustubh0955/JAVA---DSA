import java.util.*;

public class sortedrec {
  
  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) { // Check if i is at the second-to-last index
      return true;
    }
    
    if (arr[i] <= arr[i + 1]) {
      return isSorted(arr, i + 1);
    }
    
    return false;
  }
  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println(isSorted(arr, 0));
  }
}

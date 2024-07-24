import java.util.*;
public class selection {
  
  public static void selection(int n[]){
  for(int i=0;i<n.length-1;i++){
  int minPos=i;
  for(int j=i+1;j<n.length;j++){
  if(n[minPos]>n[j]){
  minPos=j;
  }
  }
  int temp=n[minPos];
  n[minPos]=n[i];
  n[i]=temp;
  }
  }

  public static void printarr(int n[]){
  for(int i=0;i<n.length;i++){
  System.out.print(n[i]+" ");
  }
  System.out.println();
  }

  //public static int compare(int a,int b){
  //return a-b;
  //}
  public static void main(String args[]){

  int n[]={5,4,1,3,2};
  Arrays.sort(n);
  printarr(n);

  //Arrays.sort(arr,Collections.reverseOrder())
  //Arrays.sort(arr,si,ei,Collections.reverseOrder())
  }
}

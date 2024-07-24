import java.util.*;
public class quicksort {
  
  public static void printArr(int arr[]){
  for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]+" ");
  }
  System.out.println();
  }

  public static void quick(int arr[],int si,int ei){
  //base case
  if(si>=ei){
  return;
  }
  
  //last element
  int pidx=parition(arr,si,ei);
  quick(arr, si, pidx-1);//left
  quick(arr, pidx+1, ei);
  }
 public static int parition(int arr[],int si,int ei){
 int pivot=arr[ei];//last index of an element
 int i=si-1;//to make place for elements smaller than pivot

 for(int j=si;j<ei;j++){
 if(arr[j]<=pivot){
 i++;
 //swap

 int temp=arr[j];
 arr[j]=arr[i];
 arr[i]=temp;
 }
 }
 i++;
 //swap

 int temp=pivot;
 arr[ei]=arr[i];
 arr[i]=temp;
 return i;
 } 
  public static void main(String args[]){
  int arr[]={6,3,9,8,2,5};
  quick(arr, 0,arr.length-1);
  printArr(arr);
  }
}

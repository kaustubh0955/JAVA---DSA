import java.util.*;
public class insertion {
public static void insertions(int n[]){
for(int i=0;i<n.length;i++){
int curr=n[i];
int prev=i-1;
//finding out the correct position to insert
while(prev>=0&& n[prev]>curr){
n[prev+1]=n[prev];
prev--;
}
n[prev+1]=curr;
}
}

  public static void printarr(int n[]){
  for(int i=0;i<n.length;i++){
  System.out.print(n[i]+" ");
  }
  System.out.println();
  }
  public static void main(String args[]){

  int n[]={5,4,1,3,2};
  insertions(n);
  printarr(n);
  }
}


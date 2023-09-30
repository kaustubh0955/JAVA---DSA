import java.util.*;
public class decrecursion {

  public static void printdec(int n){
if(n==1){
System.out.println(n);
return;
}

  System.out.println(n+" ");

  printdec(n-1);
  }
  
  public static void amin(String args[]){
  
  int n=10;
  printdec(n);
  }
}

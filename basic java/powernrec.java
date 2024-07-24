import java.util.*;
public class powernrec {
public static int power(double x,double n){

if(n==0){
return 1;
}

double pown1=Math.pow(x, (n-1));
double pown=x*pown1;
return (int) pown;
}
  public static void main(String args[]){
  System.out.println(power(2, 10));
  }
}

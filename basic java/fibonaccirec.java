import java.util.*;
public class fibonaccirec {
  
  public static int fibo(int n){
  if(n==0||n==1){
  return n;
  }

  int fibonm1=fibo(n-1);
  int fibonm2=fibo(n-2);
  int fibon=fibonm1+fibonm2;

  return fibon;
  }

  
  public static void main(String args[]){
  int n=10;
  System.out.println(fibo(n));
  }
}

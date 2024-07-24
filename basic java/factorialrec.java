import java.util.*;
public class factorialrec {
  
  public static int factorialnum(int n){
  if(n==0){
  return 1;//0 factorial equals 1
  }
  int fnm1=factorialnum(n-1);
  int fn=n*fnm1;
  return fn;
  }

  public static void main(String args[]){
  int n=5;
  System.out.println(factorialnum(n));
  }
}

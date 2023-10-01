import java.util.*;
public class poweropti {

public static int optipower(int a,int n){
if(n==0){
return 1;
}
int halfpower=optipower(a, n/2)*optipower(a, n/2);
if(n%2!=0){
halfpower=a*halfpower;
}
return halfpower;
}
  public static void main(String args[]){
  int a=2;
  int n=10;
 System.out.println( optipower(a, n));
  }
}

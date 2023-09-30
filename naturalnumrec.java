import java.util.*;
public class naturalnumrec {
public static int Sum(int n){
if(n==0){
return 0;

}
int snm1=Sum(n-1);
int sn=n+snm1;
return sn;

}
  public static void main(String args[]){
  int n=5;
System.out.println(Sum(n));  
  }
}

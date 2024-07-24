import java.util.*;
public class towerofhanoi {
  
  public static void toh(int n,String first,String second,String third){
  if(n==1){
  System.out.println("Transfer of disk " +n+ "from" +first+ "to"+third);
  return;
  }

  toh(n-1, first, third, second);

  System.out.println("Transfer of disk "+n +"from" +first+ "to" +second);

  toh(n-1, second, first, third);
  }

  public static void main(String args[]){
  int n=4;
  toh(n, "A", "B", "C");
  }
}

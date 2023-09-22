
import java.util.*;
public class binarytodecimal {
  public static void binToDec(int binNum){
  int pow=0;
  int decNum=0;

  while(binNum>0){
  int lastDigit=binNum % 10;
  decNum=(int) (decNum+(lastDigit*Math.pow(2,pow)));
  }
  System.out.println("decimal of" +binNum+"="+decNum);
  }

  public static void dectovbin(int n){
  int myNum=n;
  int pow=0;
  int binNum=0;

  while(n>0){
  int rem=n%2;
  binNum=binNum+(rem*(int)Math.pow(10,pow));

  pow++;
  n=n/2;
  }
  System.out.println("binary form of"+myNum+"="+binNum);
  }
  public static void main(String args[]){
  binToDec(101);
  dectovbin(7);
  }
}

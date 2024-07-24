import java.util.*;
public class binarystrings {
  
  public static void printbinary(int n,int lastPlace,String str){
  //base case
  if(n==0){
  System.out.println(str);
  return;
  }
  //if(lastPlace==0){
  //sit 0 on chair n
  //printbinary(n-1, 0, str.append("0"));
  //printbinary(n-1, 1, str.append("1"));
  //}else{
  //printbinary(n-1, 0, str.append("0"));
  //}
  printbinary(n-1,0, str+"0");
  if(lastPlace==0){
  printbinary(n-1, 1, str+"1");
  }
  }
  public static void main(String args[]){
  printbinary(3, 0,"");
  }
}

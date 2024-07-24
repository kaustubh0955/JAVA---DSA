import java.util.*;
public class powerof2{

public static boolean isPowerOfTwo(int n){
if(n==0){
return false;
}
 if(n==1){
return true;
}

 if(n%2==0){
 return isPowerOfTwo(n / 2);
}
else{
return false;
}
}

public static void main(String args[]){
int n = 16;
        //Solution solution = new Solution(); 
        System.out.println(isPowerOfTwo(n)); 
}
}
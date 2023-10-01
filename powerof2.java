import java.util.*;
public class powerof2{

public boolean isPowerOfTwo(int n){
if(n==0){
return false;
}else if(n==1){
return true;
}else if(n%2==0){
 return isPowerOfTwo(n / 2);
}
else{
return false;
}
}

public static void main(String args[]){
int n = 10;
        Solution solution = new Solution(); 
        System.out.println(solution.isPowerOfTwo(n)); 
}
}
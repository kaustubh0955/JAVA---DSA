//Goldman Sachs
public class FriendsPairing {

public static int friends(int n){
if(n==1|| n==2){
return n;
}

//single
int fnm1=friends(n-1);
//pair
int fnm2=friends(n-2);
int pairways=(n-1)*fnm2;

//totalways
int totalways=fnm1+pairways;
return totalways;

//return friends(n-1)+(n-1)*friends(n-2);
}
  public static void main(String args[]){
  System.out.println(friends(3));
  }
}

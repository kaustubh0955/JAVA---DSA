public class countingsort {
  public static void counting(int n[]){
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<n.length;i++){
  largest=Math.max(largest, n[i]);
  }
  int count[]=new int[largest+1];
  for(int i=0;i<n.length;i++){
  count[n[i]]++;
  }

  //sorting
  int j=0;
  for(int i=0;i<count.length;i++){
  while(count[i]>0){
  n[j]=i;
  j++;
  count[i]--;
  }
  }
  }
  
  public static void printarr(int n[]){
  for(int i=0;i<n.length;i++){
  System.out.print(n[i]+" ");
  }
  System.out.println();
  }
  public static void main(String args[]){

  int n[]={5,4,1,3,2};
  counting(n);
  printarr(n);
  }
}

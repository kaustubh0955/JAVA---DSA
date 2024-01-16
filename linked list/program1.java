package linked list;

public class program1 {
  
  public static class Node{
  int data;
  Node next;

  public Node(int data){//constructor
  this.data=data;
  this.next=next;
  }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
  //create a new node
  Node newNode=new Node(data);
  //if ll is empty
  if(head==null){
  head=tail=newNode;
  return;
  }
  

  //point new node next to the head
  newNode.next=head;//link

  //point the head to the new node
 head=newNode;
  }

  public void addLast(int data){
  //create a new node
  Node newNode=new Node(int data);
  if(head==null){
  head=tail=newNode;
  return;

}
  tail.next=newNode;

  tail=newNode;
  }
  public static void main(String args[]){
  program1 ll=new program1();
  //ll.head=new Node(1);
  //ll.head.next=new Node(2);
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(3);
    ll.addLast(4);
  //Methods
  }
}

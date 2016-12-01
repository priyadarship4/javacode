import java.util.Scanner;
class Node{
  int data;
  //HNode next;
}
public class Link{
  static Node starter;
  public static int get(){
    Scanner ss=new Scanner(System.in);
    return ss.nextInt();
  }
  public static int count(){
    if(starter==null){
      return 0;
    }
    else{
      int count=1;
      Node temp;
      temp=starter;
      while(temp.next!=null){
        count++;
        temp=temp.next;
      }
      return count;
    }
  }
  public static  void create()
  {
    System.out.println("enter the node to create");
    int nc=get();
    if(nc>0)
    {
      Node temp=new Node();
      starter=temp;
      System.out.println("enter the data");
      temp.data=get();
      for(int i=1;i<nc;i++)
      {
        temp.next=new Node();
        temp=temp.next;
        System.out.println("enter the data");
        temp.data=get();
      }
    }
    System.out.println("Total no of node is: "+count());
  }
  public static void traverse()
  {
    if(starter==null)
    {
      System.out.println("No node is present");
    }
    else
    {
      System.out.println("see the data");
      Node temp;
      temp=starter;
      while(temp!=null){
        System.out.print(temp.data+"\t");
        temp=temp.next;
      }
    }
  }
public static void main(String[] args) {
  create();
  traverse();
  insertAtBeginning();
  traverse();
  insertAtEnd();
  traverse();
  insertAtpos();
  traverse();
  search();
  traverse();
}
public static void insertAtBeginning()
{
  System.out.println("inserting the node at beginning... ,please wait ");
  Node temp=new Node();
  System.out.println("enter the data");
  temp.data=get();
  temp.next=starter;
  starter=temp;
}
public static void insertAtEnd()
{
  System.out.println("inserting the node end... ,please wait ");
  Node p1;
  int num1=count();
  p1=starter;
  while(p1.next!=null)
  {
    p1=p1.next;
  }
  Node temp=new Node();
  System.out.println("enter the data");
  temp.data=get();
  p1.next=temp;

}
public static void insertAtpos()
{
  System.out.println("enter the position at which node is insert");
  int pos=get();
  Node p1=starter;
  for(int i=0;i<pos-1;i++)
  {
    p1=p1.next;
  }
  Node temp=new Node();
  System.out.println("enter the data");
  temp.data=get();
  temp.next=p1.next;
  p1.next=temp;


}
public static void search()
{
  System.out.println("enter the data to be searched in single list");
  int data=get();
  Node temp;
  int i=0;
  for(temp=starter;temp.data!=data;temp=temp.next,i++);
  System.out.println("element found at :"+i);
}
public static void sort()
{
  Node p1,p2;
  p1=starter;
  p2=p1.next;
  while(p1.next!=null)
  {
    p2=p1.next;
    while(p2!=null)
    {
      if(p1.data>p2.data)
      {
        System.out.println("sorting the list ........");
        int temp=p1.data;
        p1.data=p2.data;
        p2.data=temp;
      }
      p2=p2.next;
    }
    p1=p1.next;

  }

}
}

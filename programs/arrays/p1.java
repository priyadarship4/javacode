class p1{
  public static void main(String ar[]){
    p1 ab=new p1();
    ab.m1(10,20,30,40,50);
  }
  void m1(int...x){
    for(int i=0;i<x.length;i++){
      System.out.println(x[i]);
    }
  }
}

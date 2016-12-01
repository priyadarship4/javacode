class p1{
  public static void m1(int...x){
    System.out.println("the no of arguments "+x.length);
    int total=0;
    for(int x1:x){
      total=total+x1;
    }
    System.out.println(" the sum:"+total);
  }
  public static void main(String[] args) {
    m1();
    m1(10);
    m1(10,20,30,40);
  }
}

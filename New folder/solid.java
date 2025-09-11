
class myobject {
  public String toString(){
    return "my object0";
  }
  public int hashCode(){
    return 100;
  }
}
class solid{
  public static void main(String[] args) {
    Object o1=new Object();
    myobject o2=new myobject();
    System.out.println(o2.hashCode());
    System.out.println(Integer.toBinaryString(10));
    System.out.println(Integer.valueOf("A8",16));
    System.out.println(Integer.reverse(123));
  }
}
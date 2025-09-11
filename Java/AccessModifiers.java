class cylinder{
    private int  radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void  setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void  setHeight(int height){
        this.height = height;
    }
    public double surfacearea(){
        return (2*Math.PI* radius * radius) + (2 *Math.PI * radius * height) ;
    }
    public double volume(){
        return Math.PI*radius*radius *height;
    }
} 

public class AccessModifiers {
   public static void main(String[] args) {
   //problem 1
    cylinder c= new cylinder();
    c.setRadius(9   );
    int r = c.getRadius();
    c.setHeight(12);
    int h= c.getHeight();
    System.out.println(r);
    System.out.println(h);
    System.out.println(c.surfacearea());
    System.out.println(c.volume());
    
   } 
}

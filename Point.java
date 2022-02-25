public class Point{
  private int x, y;
 
//Constructor:
 public Point(int incomingX, int incomingY){
    x = incomingX;
    y = incomingY;
 }
 //Setter for the X variable
 public void setX(int incomingX){
     this.x = incomingX;
 }
 
 //Setter for the Y variable
 public void setY(int incomingY){
     this.y = incomingY;
 }
 
  //Getter for the X variable
  public int getX(){
     return x;
  }
  
  //Getter for the Y variable
  public int getY(){
     return y;
  }
   
  //Calculates the Distance between two points
  public double distanceTo(Point p){
     double distance;
     distance = Math.sqrt(Math.pow(y-p.y, 2)+ Math.pow (x-p.x, 2) );
     return distance;
  }
 
  //Displays the information of the object
  public String toString(){
     return "[" + x + ", " + y + "]";
  }
}

class PointDriver{
 public static void main(String[] args) {
   Point p1 = new Point(5, 7);
   System.out.println(p1);
   Point p2 = new Point(2, 9);
   System.out.println(p2);
   
   double dist = p1.distanceTo(p2);
   	System.out.println("Distance: " + dist);
      
   System.out.println("Y Coord: " + p1.getY());
   System.out.println("Y Coord: " + p2.getY());
 }
}

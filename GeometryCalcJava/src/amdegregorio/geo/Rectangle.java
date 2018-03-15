package amdegregorio.geo;

public class Rectangle {
   private int length;
   private int width;
   
   public Rectangle() {
      length = 0;
      width = 0;
   }
   
   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }
   
   public int getLength() {
      return length;
   }
   
   public void setLength(int length) {
      this.length = length;
   }
   
   public int getWidth() {
      return width;
   }
   
   public void setWidth(int width) {
      this.width = width;
   }

   public int calculateArea() {
      return length * width;
   }
   
   public int calculatePerimeter() {
      return 2 * (length + width);
   }

   @Override
   public String toString() {
      return "Rectangle [length=" + length + ", width=" + width + "]";
   }
}

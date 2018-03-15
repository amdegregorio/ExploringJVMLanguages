package amdegregorio.geo

class Rectangle {
   int length
   int width
   
   Rectangle(length,width) {
      this.length = length
      this.width = width
   }
   
   def int calculateArea() {
      return length * width
   }
   
   def int calculatePerimeter() {
      return 2 * (length + width)
   }

   @Override
   public String toString() {
      return "Rectangle [length=$length, width=$width]"
   }
   
}

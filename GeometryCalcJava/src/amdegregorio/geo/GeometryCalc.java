package amdegregorio.geo;

public class GeometryCalc {

   public static void main(String[] args) {
      //Default values if no arguments supplied
      int length = 42;
      int width = 20;
      
      if (args.length > 0) {
         try {
            //If only one argument supplied - it's a square use it for length and width
            if (args.length == 1) {
               length = Integer.parseInt(args[0]);
               width = Integer.parseInt(args[0]);
            } else {
               length = Integer.parseInt(args[0]);
               width = Integer.parseInt(args[1]);
            }
         } catch (NumberFormatException nfe) {
            System.err.println("Usage: java GeometryCalc [length] [width]");
            System.err.println("  length: a whole number representing the length of a rectangle");
            System.err.println("  width: a whole number representing the width of a rectangle");
            System.exit(1);
         }
      }
      
      Rectangle rectangle = new Rectangle(length, width);
      System.out.println("Created rectangle: " + rectangle.toString());
      System.out.println("Area: " + rectangle.calculateArea());
      System.out.println("Perimeter: " + rectangle.calculatePerimeter());
      System.exit(0);
   }

}

package amdegregorio.geo

class GeometryCalc {

   static main(args) {
      int length = 42
      int width = 20
      
      if (args.size() > 0) {
         try {
            if (args.size() == 1) {
               length = args[0].toInteger()
               width = args[0].toInteger()
            } else {
               length = args[0].toInteger()
               width = args[1].toInteger()
            }
         } catch (e) {
            println("Usage: java GeometryCalc [length] [width]")
            println("  length: a whole number representing the length of a rectangle")
            println("  width: a whole number representing the width of a rectangle")
            System.exit(1)
         }
      }
      
      Rectangle rectangle = new Rectangle(length, width)
      println("Created rectangle: $rectangle")
      println("Area: " + rectangle.calculateArea())
      println("Perimeter: " + rectangle.calculatePerimeter())
   }

}

package amdegregorio.geo

object GeometryCalc {
  def main(args: Array[String])  {
    var length: Int = 42
    var width: Int = 20
    
    if(args.length > 0) {
      try {
          val intArgs = args.map(_.toInt)
          if (args.length == 1) {
            length = intArgs(0)
            width = intArgs(0)
          } else {
            length = intArgs(0)
            width = intArgs(1)
          }
      } catch {
        case ex: NumberFormatException => {
          println("Usage: scala GeometryCalc [length] [width]")
          println("  length: a whole number representing the length of a rectangle")
          println("  width: a whole number representing the width of a rectangle")
          System.exit(1)
        }
      }
    }
    
    val rectangle = new Rectangle(length, width)
    println("Created rectangle: " + rectangle.toString());
    println("Area: " + rectangle.calculateArea())
    println("Perimeter: " + rectangle.calculatePerimeter())
  }
}
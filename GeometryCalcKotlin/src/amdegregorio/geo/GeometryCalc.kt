package amdegregorio.geo

import kotlin.system.exitProcess

fun main(args : Array<String>) {
	var length:Int = 42
	var width:Int = 20
	
	if (args.size > 0) {
		try {
			if (args.size == 1) {
				length = args.get(0).toInt()
				width = args.get(0).toInt()
			} else {
				length = args.get(0).toInt()
				width = args.get(1).toInt()
			}
		} catch (e: NumberFormatException) {
			println("Usage: java -jar GeometryCalc.jar [length] [width]")
			println("  length: a whole number representing the length of a rectangle")
         println("  width: a whole number representing the width of a rectangle")
			exitProcess(1)
		}
	}
	
	var rectangle = Rectangle(length, width)
	println("Created rectangle: " + rectangle.toString())
   println("Area: " + rectangle.calculateArea())
   println("Perimeter: " + rectangle.calculatePerimeter())
	exitProcess(0)
}
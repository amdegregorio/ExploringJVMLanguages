package amdegregorio.geo

data class Rectangle(val length: Int, val width: Int) {
	constructor() : this(0,0)
	
	fun calculateArea(): Int {
		return length * width;
	}
	
	fun calculatePerimeter(): Int {
		return 2 * (length + width);
	}
}
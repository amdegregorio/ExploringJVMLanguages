
package amdegregorio.geo

class Rectangle(length: Int, width: Int) {
  def calculateArea(): Int = length * width
  def calculatePerimeter(): Int = 2 * (length + width)
  override def toString: String = s"Rectangle [length=$length, width= $width]"
}
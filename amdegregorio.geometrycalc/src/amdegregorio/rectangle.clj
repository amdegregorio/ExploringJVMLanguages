(ns amdegregorio.rectangle)

(defprotocol Geo 
  (calculateArea [this] "The area")
  (calculatePerimeter [this] "The perimeter"))

(defrecord Rectangle [length width] 
  Geo
  (calculateArea [this] (* length width))
  (calculatePerimeter [this] (* 2 (+ length width))))
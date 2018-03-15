(ns amdegregorio.geometrycalc
  (:gen-class)
  (:require amdegregorio.rectangle)
  (:import [amdegregorio.rectangle Rectangle]))

;from https://stackoverflow.com/questions/5621279/in-clojure-how-can-i-convert-a-string-to-a-number
(defn parse-int [v] 
   (try 
     (Integer/parseInt (re-find #"^\d+" (.toString v))) 
     (catch NumberFormatException e 0)))

(defn -main
    [& args]
  ; Read the args and set up length and width
  ; if no command line args supplied, use default values
  ; if one command line arg sent - its a square use length for length and width
  (if (nth args 0) 
    (def length (parse-int (nth args 0)))
    (def length 42))
  (if (= (count args) 2)
    (def width (parse-int (nth args 1)))
    (if (= (count args) 1)
      (def width length)
      (def width 20)))
  ;create the rectangle and print it's vitals
  (def rectangle (Rectangle. length width))
  (println rectangle)
  (println(.calculateArea rectangle))
  (println(.calculatePerimeter rectangle))
)
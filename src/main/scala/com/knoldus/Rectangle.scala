package com.knoldus

object FirstSolution {

  abstract class Figure {
    def area(height: Double, width: Double): Double
  }

  class Rectangle extends Figure {
    override def area(height: Double, width: Double): Double = {
      height * width
    }
  }

  class Square extends Rectangle {
    override def area(height: Double, width: Double): Double = {
      if (height != width) super.area(height, width) else height * height
    }
  }

}





























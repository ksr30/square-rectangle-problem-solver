package com.knoldus

object SecondSolution {

  abstract class Figure {
    def area(height: Double, width: Double): Double
  }

  class Rectangle extends Figure {
    override def area(height: Double, width: Double): Double = height * width
  }

  class Square extends Rectangle {
    override def area(height: Double, width: Double): Double = {
      if (width == 0) height else area(height + height, width - 1)
    }
  }


}
















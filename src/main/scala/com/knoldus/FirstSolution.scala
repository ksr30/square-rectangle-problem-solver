package com.knoldus

object FirstSolution {
  /**
   * Figure class is an abstract class that has a basic implementation for figures such as Rectangle and Square
   */
  abstract class Figure {
    def area(height: Double, width: Double): Double
  }
  /**
   * Rectangle extends Figure and overrides the method area
   */
  class Rectangle extends Figure {
    override def area(height: Double, width: Double): Double = {
      height * width
    }
  }
  /**
   * Square extends Rectangle and overrides the method area and calculates area for square and also handles the calculation of area of rectangles
   */
  class Square extends Rectangle {
    override def area(height: Double, width: Double): Double = {
      if (height != width) super.area(height, width) else height * height
    }
  }

}





























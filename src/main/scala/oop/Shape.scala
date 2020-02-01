package oop

trait Shape {
  def draw(): String
  def area(): Double
}

object Shape {
  def create(name: String, x: Int, y: Int):Shape= name match
    {
    case ("circle")=>new Circle(x)
    case ("cylinder")=> new Cylinder(x,y)
    case ("square")=>new Square(x)
    case("squarecuboid")=>new SquareCuboid(x,y)

  }

  //  { 
  //  if(name.equals("circle")) {
  //   var data: Shape = new Circle(x) 
  //      println("hi" + data.draw())
  //       return data 
  //    }else if(name.equals("cylinder")) 
  //      {
  //       var data: Shape = new Cylinder(x,y) 
  //        println("hi" + data.draw())
  //              return data 
  //      }else if(name.equals("square")) 
  //    {      var data: Shape = new Square(x) 
  //      println("hi" + data.draw()) 
  //      return data
  //         }else if(name.equals("squarecuboid")) { 
  //      var data: Shape = new SquareCuboid(x, y) 
  //      println("hi" + data.draw()) 
  //      return data //    } 
  //      var data1:Shape=new Circle(1)
  //      return data1  
  //      }else 
  //      { 
  //      println("No match found !") 
  //      return 
  //      } 
  //      }

}



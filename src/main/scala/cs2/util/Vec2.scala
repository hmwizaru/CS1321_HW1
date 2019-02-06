package cs2.util

class Vec2 private(var _x:Double, var _y:Double) {
  
  def x = _x
  def y = _y

	//Default constructor creates a Vec2 of zeroes
  def this() = {
    this(0.0 , 0.0)
  }

  //Copy constructor create a "deep" copy of the input object
  def this(toCopy:Vec2) = {
    this(toCopy._x, toCopy._y)
  }

  //Provided toString method simplifies printing, e.g. println(vec.toString) OR println(vec)
	override def toString():String = "("+x+","+y+")"

	//Methods for addition and subtraction of vectors
	def + (other:Vec2):Vec2 = new Vec2(_x + other._x, y + other._y)
	def - (other:Vec2):Vec2 = new Vec2(_x - other._x, y - other._y)

	def += (other:Vec2): Vec2 = {
	  _x += other._x
	  _y += other._y 
	  this 
	}
	def -= (other:Vec2): Vec2 = {
	  _x -= other._x
	  _y -= other._y
	  this
	}

	//Methods for multiplication and division of vectors by a scalar (non-vector)
	def * (scalar:Double):Vec2 = new Vec2(this.x*scalar, this.y*scalar)
	def / (scalar:Double):Vec2 = new Vec2(this.x/scalar, this.y/scalar)

	def *= (scalar:Double): Vec2 = {
	  _x *= scalar
	  _y *= scalar
	  this
	}
	def /= (scalar:Double): Vec2 = {
	  _x /= scalar
	  _y /= scalar
	  this
	}

	//Methods to determine the length of a vector (magnitude and length should return the same value)
	def magnitude():Double = math.sqrt(_x*_x + _y*_y)
	def length():Double = math.sqrt(_x*_x + _y*_y)

	//Method to return a new vector that is in the same direction, but length 1

	def unary_~() = new Vec2(-1*_x,-1*_y)

	//Methods to calculate the dot product, and determine the angle between 2 vectors
	def dot(other:Vec2):Double = this._x*other._x + this._y*other._y
	def **(other:Vec2):Double = this._x*other._x - this._y*other._y

	def angleBetween(other:Vec2):Double = math.cos(dot(this)*dot(other)/this.length*other.length)

	def <>(other:Vec2):Double = math.cos(dot(this)*dot(other)/this.length*other.length)
}


object Vec2 {
  
  def main(args: Array[String]): Unit = {
    val v1 = new Vec2(1,2)
    val v2 = new Vec2(2,2)
    v1 * 2
    println(v1)
  }
  
  
}












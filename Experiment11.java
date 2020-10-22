/*11.Write  a  Java  Program  to  create  an  abstract  class  named  Shape 
that  contains two  integers  and  an  empty  method  named  print  Area(). 
Provide  three  classes named Rectangle, Triangle and Circle such that each 
one of the classes extends the class Shape. Each one of the classes contains 
only the method print Area () that prints the area of the given shape.
*/

abstract class Shape
{
	int a, b;
	abstract void printArea();
}
class Rectangle extends Shape
{
	public Rectangle(int x, int y)
	{
		a = x;
		b = y;
	}
	public void printArea()
	{
		System.out.println("Rectangle Area => " + (a * b));
	}
}
class Triangle extends Shape
{
	public Triangle(int x, int y)
	{
		a = x;
		b = y;
	}
	public void printArea()
	{
		System.out.println("Triangle Area => " + (0.5 * a * b));
	}
} 
class Circle extends Shape
{
	public Circle(int x)
	{
		a = x;
	}
	public void printArea()
	{
		System.out.println("Circle Area => " + (3.14 * a * a));
	}
}
public class Experiment11{
	public static void main(String[] args)
	{
		Rectangle R = new Rectangle(10,20);
		Triangle T = new Triangle(5,10);
		Circle C = new Circle(8);
                R.printArea();
		T.printArea();
		C.printArea();

        }
}

/*output:
Rectangle Area => 200
Triangle Area => 25.0
Circle Area => 200.96
*/

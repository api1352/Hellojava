package assignment4;

abstract class Shape {
	 
	 abstract void area();
	 abstract void perimeter();
	 
	}
	  class Circle extends Shape{
		void area() {
			System.out.println("Area of Circle");
		}
		void perimeter() {
			System.out.println("Perimeter of Circle");
		}
	 }
	 class Rectangle extends Shape{
		 void area() {
				System.out.println("Area of Rectangle");
			}
			void perimeter() {
				System.out.println("Perimeter of Rectangle");
			} 
	 }
	  class Triangle extends Shape{
		 void area() {
				System.out.println("Area of Triangle");
			}
			void perimeter() {
				System.out.println("Perimeter of Triangle");
			} 
	}
	public class Main1{
	 public static void main(String[] args) {
		Shape obj1 = new Circle();
		Shape obj2 = new Rectangle();
		obj1.area();
		obj2.perimeter();
	}
	}


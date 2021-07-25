package assignment4;

public class ArrayOutOfIndexException {
	   public static void main(String args[])
	   {
	      try{
	        int a[]=new int[100];
	        //as index of array starts from 0 so 100 is out of boundary
	        a[100] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	   }
}
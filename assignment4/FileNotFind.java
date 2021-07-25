package assignment4;
import java.io.*;

public class FileNotFind {

	public static void main(String[] args) {
	    try {
          File f=new File("file.txt");  
          PrintWriter p1=new PrintWriter(new FileWriter(f), true);        
	        p1.println("Hello Robin");
	          p1.close();
	        
	          // changing the file operation 
	          // to read-only 
	        f.setReadOnly();
	        
	          // trying to write to new file
	          PrintWriter p2=new PrintWriter(new FileWriter("file.txt"), true);
	        p2.println("Hello Robin");
	    }
	    catch(Exception ex) {
	        ex.printStackTrace();
	    }
	  }
	}
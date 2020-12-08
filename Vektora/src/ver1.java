import java.util.Scanner; //
public class ver1 
{

	public static void main(String[] args) 
	{
		
		Scanner console = new Scanner(System.in);
		
		//переменна€ х
		 System.out.println("¬ведите x");
	      int x = console.nextInt();
	      
	      System.out.println("¬ведите x2");
	      int x2 = console.nextInt();
	      
		//переменна€ у
	      System.out.println("¬ведите y");
	      int y = console.nextInt();
	      System.out.println("¬ведите y2");
	      int y2 = console.nextInt();
	      
	      //переменна€ z
	      System.out.println("¬ведите z");
	      int z = console.nextInt();
	      
	      System.out.println("¬ведите z2");
	      int z2 = console.nextInt();
	      
	     //длина векторов
	      double sum = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
	     System.out.println (sum);
	      
	     //—умма векторов
	     System.out.print("—умма x+y+z : ");
	     System.out.print ( x+x2 );
	     System.out.print ( ";");
	     System.out.print ( y+y2 );
	     System.out.print ( ";");
	     System.out.print ( z+z2);
	    
	}

}

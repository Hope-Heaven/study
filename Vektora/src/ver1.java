import java.util.Scanner; //
public class ver1 
{

	public static void main(String[] args) 
	{
		
		Scanner console = new Scanner(System.in);
		
		//���������� �
		 System.out.println("������� x");
	      int x = console.nextInt();
	      
	      System.out.println("������� x2");
	      int x2 = console.nextInt();
	      
		//���������� �
	      System.out.println("������� y");
	      int y = console.nextInt();
	      System.out.println("������� y2");
	      int y2 = console.nextInt();
	      
	      //���������� z
	      System.out.println("������� z");
	      int z = console.nextInt();
	      
	      System.out.println("������� z2");
	      int z2 = console.nextInt();
	      
	     //����� ��������
	      double sum = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
	     System.out.println (sum);
	      
	     //����� ��������
	     System.out.print("����� x+y+z : ");
	     System.out.print ( x+x2 );
	     System.out.print ( ";");
	     System.out.print ( y+y2 );
	     System.out.print ( ";");
	     System.out.print ( z+z2);
	    
	}

}

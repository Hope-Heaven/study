
import java.util.Scanner;
public class a1 
{
	 public static void main(String[] args) 
	 
	  {
	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("������� �����");
	      int x = console.nextInt(); //�����
	      int sum = 0;
	    		  
	      while (x != 0) //���� � �� = 0
	      {
	      sum = sum + (x % 10); //����� : 1  
	      x = x / 10;
	      }
	      System.out.println( sum ); 
	      if (sum == 3 || sum == 6 || sum == 9 )System.out.println("Yes");  // if (sum = 3, 6, 9)
	      else  System.out.println("no");  //����� ������� �����     

	   }
}

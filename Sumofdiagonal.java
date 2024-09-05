import java.util.*;
public class Sumofdiagonal {
	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	      int r =sc.nextInt();
	      int a[][]= new int[r][r];{
	      for(int i=0;i<r;i++)
	      {
	          for(int j=0;j<r;j++)
	          {
	          a[i][j]=sc.nextInt();
	      }
	        
	      }
	       int Sumofdia = 0;
	      for(int i=0;i<r;i++){
	           Sumofdia += a[i][i];
	          }
	          
	          System.out.println(Sumofdia);
	}
	}
}
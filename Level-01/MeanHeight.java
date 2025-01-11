import java.util.*;

class MeanHeight
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  double[] array = new double[11];
  double sum =0;
   for(int i=0;i<11;i++){
        array[i] = sc.nextDouble(); 
		sum+=array[i];
   }
   System.out.println(sum/11);
 }
}
import java.util.Random;

public class ComputeMethods5026211106 {

	Random r = new Random();
   	public double fToC(double degreesF) {
      	return 5.0/9*(degreesF-32);
   }

   	public double hypotenuse(int a, int b) {
           return Math.sqrt((a*a)+(b*b));
   }

   	public int roll() {
           return r.nextInt(6)+1;
   }

}
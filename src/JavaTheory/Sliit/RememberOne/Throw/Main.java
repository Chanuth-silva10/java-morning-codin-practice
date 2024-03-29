package JavaTheory.Sliit.RememberOne.Throw;
//Exceptions
//Throw and Throws(Throwing an exception)
//User defined exceptions
class SmallValueException extends  Exception{
	public SmallValueException(String err) {
		super(err);
	}
}

class Calc{
	public static float calc(float x,float y) throws SmallValueException{
		float z;
		z = x/y;
		if(z < 0.1) {
			throw new SmallValueException("x and y should be of similer size ");
			//generate a runtime error
		}
		return z;
	}
}


public class Main {
   public static void main(String args[]) {
	   float a,b,c;
	   a = 1;
	   b = 10000;
	   try {
		c = Calc.calc(a, b);
	} catch (SmallValueException e) {
		System.out.println(e);
	}
   }
}

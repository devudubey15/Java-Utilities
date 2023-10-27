// 1) define your exception class by name "MyArithException"
// (MyArithException.java)
// define class "Calculator"   (Calculator.java)
// In this class define a function,which will accept an int and return double of it.
// e.g int caldouble(int)
// This function will check an int which is passed to it
// It will raise the  exception if 0 is passed or negative passed
// in case of 0 caller of this method should get error message
// "Zero not allowed" 
// in case of negative caller of this method should get error message
// "negative not allowed"
// In case of positive value it should simply return the double value.
// 	[ this method shouldn't handle the exception]

// Now define class "MyCalcApp" (MyCalcApp.java)
// In this class you accept a number from user and pass that no. to
// caldouble() method which is mentioned above.

class MyArithException extends Exception 
{
    public MyArithException(String message)
    {
        super(message);
    }
	
}
class NegativeValueException extends MyArithException
{
    public NegativeValueException(String message)
    {
        super(message);
    }
}
class ZeroValueException extends MyArithException
{
    public ZeroValueException(String message)
    {
        super(message);
    }
}
class Calculator
{
        int caldouble(int num) throws NegativeValueException,ZeroValueException
        {
            if(num <0)
            {
                throw new NegativeValueException("negative not allowed" );
            }
            if(num ==0)
            {
                throw new ZeroValueException("Zero not allowed");
            }
            return num*2;
        }

}

public class MycalcApp
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        try{
                calculator.caldouble(0);
        }
        catch(NegativeValueException ne)
        {
            System.out.println(ne);
        }
        catch(ZeroValueException ze)
        {
	        System.out.println(ze);
        }
    }
}

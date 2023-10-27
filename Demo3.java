
// Revision_3) 
// create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
// now define "Demo" class with main function. Inside main function create array of Object class 
// which will store instances of above mentioned classes. Traverse through this array and call "Cfun()" 
// of class C only.

class A
{
    void Afun(){
                System.out.println("Afun");
    }
}
class B{
    void Bfun()
    {
            System.out.println("Bfun");
    }
}
class C{
    void Cfun()
    {
        System.out.println("Cfun");
    }
}
class D{
        void Dfun()
        {
                System.out.println("Dfun");
        }
}
public class Demo3
{
    public static void main (String args[])
    {
        Object arrObject[] = new Object[4];
        arrObject[0] = new A();
        arrObject[1] = new B();
        arrObject[2] = new C();
        arrObject[3] = new D();

        for( int i =0; i < arrObject.length; i++)
        {
            if( arrObject[i] instanceof C )
            {
                C ref =(C)arrObject[i];
                ref.Cfun();
            }
        }

    }
}
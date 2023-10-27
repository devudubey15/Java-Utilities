// Revision_2)
// Define a class Sample with member variable “char ch” and a parameterized constructor. 
// Create some instances(at least 2) of this class by passing any alphabet.  Now achieve following tasks:

// a) when you print the reference it should be display the character which was passed during instantiation.
// b) if two instances have same character or an alphabet, their "equals()" should return true and obviously "hashCode()" 
// also should be same.

class Sample{
   private char ch ;

   Sample(char ch)
   {
    this.ch =ch;
   }
   @Override
   public String toString()
   {
        return "[" + ch + "]";
   }
   public int hashCode()
   {
    return Character.hashCode(ch);
   }
   public boolean equals(Sample obj)
   {
    return this.ch == obj.ch;
   }
}
public class Demo2{
    public static void main(String[] args)
    {
        Sample sample1 = new Sample('Z');
        Sample sample2 = new Sample('Y');

        System.out.println(sample1);
        System.out.println(sample2);

        System.out.println(sample1.hashCode());
        System.out.println(sample2.hashCode());

        System.out.println(sample1.equals(sample2));

    }
}
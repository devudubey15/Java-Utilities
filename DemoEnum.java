// enum is a type of class which can'tbe instariated, we use enum keyword for it complier implicitly 
// makes it into a class , we can't instantiated because it has private constructor, 
//  enum can be outside or inside a class enum holds constant values with type enum. sovalues which are being hold by 
// enum are references of enum. enum values are used generally in switch statement.

enum MyFont
{
    PLAIN, BOLD,ITALIC;
}
class MyComponent{

        void detecting (MyFont font)
        {
            switch(font)
            {
                case PLAIN: System.out.println("plain"); break;
                case BOLD: System.out.println("bold"); break;
                case ITALIC: System.out.println("italic"); break;
            }
        }

}
class DemoEnum
{
    public static void main(String[] args)
    {
        MyComponent myComponent = new MyComponent();
        myComponent.detecting(MyFont.PLAIN);
        myComponent.detecting(MyFont.ITALIC);
        myComponent.detecting(MyFont.BOLD);
        //myComponent.detecting(1); //this will not compile hence there is no risk of unpridictible result 
    }
}
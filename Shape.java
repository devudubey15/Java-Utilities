class First{
    
        private int width;
        private int hight;
    
        void setwidth(int width)
        {
            this.width = width;
        }
        void setheight(int hight)
        {
            this.hight = hight;
        }
        int getwidth()
        {
            return this.width;
        }
        int getheight()
        {
            return this.hight;
        }
    
    
}
public class Shape
{
    public static void main(String args[])
    {
        First s=new First();
        s.setwidth(45);
        s.setheight(55);
        System.out.println(s.getheight()+" "+s.getwidth());

    }
}
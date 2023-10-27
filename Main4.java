// 4.Create a class "Top1" with "disp1()" method.
// From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
// Now show how will u achieve dynamic polymorphism.
class Top1 {
    void disp1() {
        System.out.println("Top1's disp1 method");
    }
}

class Bottom1 extends Top1 {
    
    void disp1() {
        System.out.println("Bottom1's disp1 method");
    }
}

class Bottom2 extends Top1 {
    
    void disp1() {
        System.out.println("Bottom2's disp1 method");
    }
}

class Bottom3 extends Top1 {
    
    void disp1() {
        System.out.println("Bottom3's disp1 method");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Top1 top1Ref;
        
        top1Ref = new Bottom1();//upcasting
        top1Ref.disp1(); // latebinding
        
        top1Ref = new Bottom2();//upcasting
        top1Ref.disp1(); //late_bibding
        
        top1Ref = new Bottom3();//upcasting
        top1Ref.disp1(); //late_bibding
    }
}

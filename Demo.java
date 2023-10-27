class A {
    private static int cnt; // static member variable
    public int cnt1;

    public static void Set_cnt(int cnt) { // static member function
        A.cnt = cnt;
    }

    public static int Get_cnt() { // static member function
        return A.cnt;
    }

    public void Set_cnt1(int cnt1) { // non-static member function
        this.cnt1 = cnt1;
    }

    public int Get_cnt1() { // non-static member function
        return this.cnt1;
    }
}

class B {
    private static int cnt2;
    public int cnt3;

    public static void Set_cnt2(int cnt2) { // static member function
        B.cnt2 = cnt2;
    }

    public static int Get_cnt2() { // static member function
        return cnt2;
    }

    public void Set_cnt3(int cnt3) { // non-static member function
        this.cnt3 = cnt3;
    }

    public int Get_cnt3() { // non-static member function
        return this.cnt3;
    }
}

class C {
    private static int cnt4;
    public int cnt5;

    public static void Set_cnt4(int cnt4) { // static member function
        C.cnt4 = cnt4;
    }

    public static int Get_cnt4() { // static member function
        return cnt4;
    }

    public void Set_cnt5(int cnt5) { // non-static member function
        this.cnt5 = cnt5;
    }

    public int Get_cnt5() { // non-static member function
        return this.cnt5;
    }
}

public class Demo {
    public static void main(String[] args) {
        A.Set_cnt(11111111);
        System.out.println(A.Get_cnt());

        B.Set_cnt2(2222222);
        System.out.println(B.Get_cnt2());

        C.Set_cnt4(3333333);
        System.out.println(C.Get_cnt4());

        A a = new A();
        a.Set_cnt1(111);
        System.out.println(a.Get_cnt1());

        B b = new B();
        b.Set_cnt3(222);
        System.out.println(b.Get_cnt3());

        C c = new C();
        c.Set_cnt5(999);
        System.out.println(c.Get_cnt5());
    }
}

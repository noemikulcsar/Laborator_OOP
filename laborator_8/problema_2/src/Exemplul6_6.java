public class Exemplul6_6 {
    public static void f() throws ExceptieTip1 {
        try {
            g();
        } catch (ExceptieTip2 e) {
            throw new ExceptieTip1("Exceptie de tipul 1 generata in interiorul lui f()");
        }
    }

    public static void g() throws ExceptieTip2 {
        throw new ExceptieTip2("Exceptie de tipul 2 generata in interiorul lui g()");
    }
}

class ExceptieTip1 extends Exception {
    public ExceptieTip1(String mesaj) {
        super(mesaj);
    }
}

class ExceptieTip2 extends Exception {
    public ExceptieTip2(String mesaj) {
        super(mesaj);
    }
}

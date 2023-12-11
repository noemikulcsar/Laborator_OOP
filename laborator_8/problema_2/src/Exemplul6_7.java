class A {
    public void metoda() throws ExceptieNivel1 {
        throw new ExceptieNivel1("Exceptie la nivelul 1");
    }
}

class B extends A {
    @Override
    public void metoda() throws ExceptieNivel2 {
        throw new ExceptieNivel2("Exceptie la nivelul 2");
    }
}

class C extends B {
    @Override
    public void metoda() throws ExceptieNivel3 {
        throw new ExceptieNivel3("Exceptie la nivelul 3");
    }
}

public class Exemplul6_7 {

}

class ExceptieNivel1 extends Exception {
    public ExceptieNivel1(String mesaj) {
        super(mesaj);
    }
}

class ExceptieNivel2 extends ExceptieNivel1 {
    public ExceptieNivel2(String mesaj) {
        super(mesaj);
    }
}

class ExceptieNivel3 extends ExceptieNivel2 {
    public ExceptieNivel3(String mesaj) {
        super(mesaj);
    }
}

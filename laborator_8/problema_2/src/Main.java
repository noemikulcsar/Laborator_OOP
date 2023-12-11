public class Main
{
    public static void main(String[] args) {
        //6_2
        Object obiect = null;

        try {
            // Trying to call a method on a null reference
            obiect.toString();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
        //6_3
        int[] vector = {1, 2, 3};

        try {
            System.out.println(vector[5]); // Accesarea unui element în afara limitelor vectorului
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException prinsă!");
        }
        //6_4
        try {
            throw new Exception("Acesta este un mesaj de excepție!");
        } catch (Exception e) {
            System.out.println("Excepție prinsă: " + e.getMessage());
        } finally {
            System.out.println("Blocul finally a fost executat.");
        }
        //6_5
        try {
            throw new ExempluException("Aceasta este o excepție personalizată!");
        } catch (ExempluException e) {
            e.afiseazaMesaj();
        }
        //6_6
        try {
            Exemplul6_6.f();
        } catch (ExceptieTip1 e) {
            System.out.println("Excepție de tipul 1 prinsă: " + e.getMessage());
        }
        //6_7
        A obiectC = new C();
        try {
            obiectC.metoda();
        } catch (ExceptieNivel1 e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
import java.util.*;
class TestIntegerMatrix {
    public static void main(String[] args) {
        // Creaza tablourile de intregi m1, m2
        Long l= Long.valueOf(0);
        Long[][] m1 = new Long[][]{{l+1, l+2, l+3}, {l+4, l+5, l+6}, {l+1, l+1, l+1}};
        Long[][] m2 = new Long[][]{{l+1, l+1, l+1}, {l+2, l+2, l+2}, {l+0, l+0, l+0}};
        // Creaza o instanta de IntegerMatrix
        LongMatrix integerMatrix = new LongMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(
                m1, m2, integerMatrix.addMatrix(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(
                m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
    }
}
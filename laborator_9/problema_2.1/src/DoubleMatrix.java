public class DoubleMatrix extends GenericMatrix<Double> {
    @Override /** Aduna doi Double */
    protected Double add(Double o1, Double o2) {
        return o1 + o2;
    }
    @Override /** Inmulteste doi Double */
    protected Double multiply(Double o1, Double o2) {
        return o1 * o2;
    }
    @Override /** Specifica zero pentru un Double */
    protected Double zero() {
        return 0.0; }
}
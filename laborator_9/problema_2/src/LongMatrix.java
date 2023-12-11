class LongMatrix extends GenericMatrix<Long> {
    @Override
    /** Aduna doi intregi */
    protected Long add(Long o1, Long o2) {
        return o1 + o2;
    }

    @Override
    /** Inmulteste doi intregi */
    protected Long multiply(Long o2, Long o1) {
        return o1 * o2;
    }

    @Override
    /** Specifica zero pentru un intreg */
    protected Long zero() {
        return Long.valueOf(0);
    }
}

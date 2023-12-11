class ExempluException extends Exception {
    private String mesaj;

    public ExempluException(String mesaj) {
        this.mesaj = mesaj;
    }

    public void afiseazaMesaj() {
        System.out.println("Mesajul din ExempluException: " + mesaj);
    }
}

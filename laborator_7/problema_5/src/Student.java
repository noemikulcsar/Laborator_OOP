class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public Masina getMasina() {
        return masina;
    }
    public void setMasina(Masina masina) {
        this.masina = masina;
    }
    public String toString()
    {
        return "Nume: "+this.nume+" Prenume: "+this.prenume;
    }
    @Override
    //shallow copy
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //deep copy
    public Object deepClone() throws CloneNotSupportedException {
        Student studentClone = (Student) super.clone();
        studentClone.masina = (Masina) masina.clone();
        return studentClone;
    }
}

public class Manual extends Rechizita
{
    public Manual(String eticheta) {
        super(eticheta);
    }
    @Override
    String getNume() {
        return this.getEticheta()+" Manual";
    }
}

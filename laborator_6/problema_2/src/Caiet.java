public class Caiet extends Rechizita
{
    public Caiet(String eticheta) {
        super(eticheta);
    }
    @Override
    String getNume() {
        return this.getEticheta()+" Caiet";
    }
}

package exercicio3.professores;

public class Estatutario extends Professor {

    private float trienio;
    private float rioprev;

    public float getTrienio() {
        return trienio;
    }

    public void setTrienio(float trienio) {
        this.trienio = trienio;
    }

    public float getRioprev() {
        return rioprev;
    }

    public void setRioprev(float rioprev) {
        this.rioprev = rioprev;
    }

    @Override
    public double calcularSalario() {
        return super.getCargaHoraria() * super.getValorDaHora() + trienio - rioprev;
    }
}
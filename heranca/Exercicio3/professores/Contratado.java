package exercicio3.professores;

public class Contratado extends Professor {

    private float inss;

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    @Override
    public double calcularSalario() {
        return super.getCargaHoraria() * super.getValorDaHora() - inss;
    }
}
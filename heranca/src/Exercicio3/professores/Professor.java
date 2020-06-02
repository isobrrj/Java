package exercicio3.professores;

import Exercicio3.comum.Funcionario;

public class Professor extends Funcionario {

    private int cargaHoraria;
    private double valorDaHora;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int _cargaHoraria) {
        this.cargaHoraria = _cargaHoraria;
    }
//

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double _valorDaHora) {
        this.valorDaHora = _valorDaHora;
    }

    @Override
    public double calcularSalario() {
        return cargaHoraria * valorDaHora;
    }
}

package Exercicio3.comum;

public abstract class Funcionario {

    private String matricula;
    private String nome;
    private String endereço;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }
//

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }
//

    public String getEndereço() {
        return endereço;

    }

    public void setEndereço(String _endereço) {
        this.endereço = _endereço;
    }

    public abstract double calcularSalario();
}

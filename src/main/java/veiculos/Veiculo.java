package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected int velocidade;

    public Veiculo(String nome) {

        this.nome = nome;
        this.velocidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getVelocidade() {
        return velocidade;
    }

    public void acelera (int a) {
        this.velocidade = this.velocidade + a;
    }
    public void freia (int a) {
        this.velocidade = this.velocidade - a;
    }

}

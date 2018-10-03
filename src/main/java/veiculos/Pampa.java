package veiculos;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;

    public Pampa(String n) {
        super(n);
        cacambaFechada = true;
        tracaoIntegral = false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velocidade == 0){
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral da pampa: " + nome + " está : "+ tracaoIntegral);
        }
        else {
            System.out.println("Tração integral da pampa: " + nome + "não foi alterada e  está : "+ tracaoIntegral);
        }
        return tracaoIntegral;
    }

    @Override
    public void frear(int i) {
        this.freia(i);
        System.out.println("Pampa "+ nome +" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        this.acelera(i);
        System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
    }

    public boolean abrirCacamba(){
        if (cacambaFechada){
            if(velocidade == 0) {
                System.out.println("Abrindo caçamba da pampa " + nome);
                cacambaFechada = false;
                return true;
            }
            else{
                System.out.println("A caçamba não pode ser aberta com o carro: " + nome +" ,em movimento ");
                return false;
            }
        }
        System.out.println("Caçamba já estava aberta da pampa "+ nome);
        return false;
    }
    public boolean fecharCacamba(){
        if (!cacambaFechada){
            if(velocidade == 0) {
                System.out.println("Fechando caçamba da pampa " + nome);
                cacambaFechada = true;
                return true;
            }
            else{
                System.out.println("A caçamba não pode ser fechada com o carro: " + nome +" ,em movimento ");
                return false;
            }
        }
        System.out.println("Caçamba já estava fechado da pampa "+ nome);
        return false;
    }



}
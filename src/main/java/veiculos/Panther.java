package veiculos;

public class Panther extends Veiculo implements VeiculoAnfibio, TracaoIntegral, Conversivel {
    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private int temperaturaRefrigerador;
    private boolean lastroCheio;

    public Panther(String n) {
        super(n);
        tracaoIntegral = false;
        capotaAberta = false;
        rodasRecolhidas = false;
        temperaturaRefrigerador = 15;
        lastroCheio = false;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidade == 0 &&  !capotaAberta){
            capotaAberta = true;
            System.out.println("abrindo capota do panther "+ nome);
            return true;
        }
        System.out.println("Não é possivel abrir a capota do panther "+ nome);
        return false;
    }

    @Override
    public boolean fecharCapota() {
        if(velocidade == 0 && capotaAberta){
            System.out.println("fechando capota do panther "+ nome);
            capotaAberta = false;
            return true;
        }
        System.out.println("capota do panther "+ nome+ " não pode ser fechada");
        return false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velocidade == 0 && !rodasRecolhidas){
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral do panther: " + nome +" está " + tracaoIntegral);
        }
        else {
            System.out.println("Tração integral do panther: " + nome +" não foi alterada e está " + tracaoIntegral);
        }
        return tracaoIntegral;
    }

    @Override
    public boolean recolherRodas() {
        if (!rodasRecolhidas && !lastroCheio){
            System.out.println("rodas do panther "+ nome+" foram recolhidas");
            rodasRecolhidas = true;
            return true;
        }
        System.out.println("não pode recolher as rodas do panther "+ nome);
        return false;
    }

    @Override
    public boolean abrirRodas() {
        if (rodasRecolhidas ){
            System.out.println("abrindo rodas do panther "+ nome);
            rodasRecolhidas = false;
            return true;
        }
        System.out.println("rodas do panther "+ nome+" já estavam abertas");
        return false;
    }

    @Override
    public void esvaziarLastro() {
        if(lastroCheio){
            System.out.println("Esvaziando lastro do panther "+ nome);
            lastroCheio = false;
        }
        else{
            System.out.println("O lastro do panther "+ nome +" Está cheio");
        }

    }
    public void encherLastro(){
        if(!lastroCheio){
            System.out.println("Enchendo lastro do panther "+ nome);
            lastroCheio = true;
        }
        else{
            System.out.println("O lastro do panther "+ nome +" Está vazio");
        }
    }

    @Override
    public void frear(int i) {
        this.freia(i);
        System.out.println("Panther "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        this.acelera(i);
        System.out.println("Panther "+ nome+"acelerando com intensidade " + i);

    }

    public void setTempRefri(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)){
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}
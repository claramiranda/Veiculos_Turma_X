package br.fiap.es2px.model;

public class Carro extends Veiculo {

    private boolean arCondicionado;
    private boolean estaLigado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        setVelocidadeMaxima(180);
        this.arCondicionado = false;
        this.estaLigado = false;
    }


    //LigarAr()
    public boolean ligarAr(){
        //verificar se o carro está ligado
        if (estaLigado){
            System.out.println("[CARRO] Ligando o Ar Condicionado");
            this.arCondicionado = true;
        }
        else {
            System.out.println("[CARRO] Erro, não é possível ligar o ar condicionado com o carro desligado.");
        }
        return this.arCondicionado;
    }


    //ligarCarro()
    public void ligarCarro(){
        if(estaLigado){
            System.out.println("[CARRO] Carro já está ligado");
        }
        else {
            System.out.println("[CARRO] Ligando o motor!");
            estaLigado = true;
        }
    }


    //desligarCarro()
    public void desligarCarro(){
        if(!estaLigado){
            System.out.println("[CARRO] Carro já está desligado");
        }
        else {
            System.out.println("[CARRO] Desligando o motor!");
            estaLigado = false;
            arCondicionado = false;
        }
    }

    @Override
    public String obterStatus() {
         String str = super.obterStatus();

         str += "\nCarro ligado: " + this.estaLigado;
         str += "\nAr Condicionado ligado: " + this.arCondicionado;

         return str;
    }
}

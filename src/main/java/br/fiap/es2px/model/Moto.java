package br.fiap.es2px.model;

public class Moto extends Veiculo{
    private boolean empinando;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.empinando = false;
        setVelocidadeMaxima(120);

    }


    public boolean empinarMoto(){
        //Consultar velocidade atual
        if ((getVelocidadeAtual() >= 20 ) && (getVelocidadeAtual() <= 50)){
            this.empinando = true;
            System.out.println("[MOTO] Empinando a moto!! ");
        }

        else{
            if(getVelocidadeAtual() <= 20 ){
                System.out.println("[MOTO] Velocidade baixa demais.");
            }
            else {
                System.out.println("[MOTO] Velocidade alta demais.");
            }
        }

        return this.empinando;
    }

    @Override
    public void obterStatus() {
        String str = "\nMoto está dando grau: " + this.empinando;
        super.obterStatus();

        System.out.println(str);
    }
}

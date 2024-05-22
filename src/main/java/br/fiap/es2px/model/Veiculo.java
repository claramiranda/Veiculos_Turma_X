package br.fiap.es2px.model;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;


    //CONSTRUTORES
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public Veiculo() {
        this.velocidadeAtual = 0;
        //this.velocidadeMaxima = 0;
    }

    //TODO desenvolver teste unitário
    public void acelerar(int incremento){
        if (incremento <= 0){
            System.out.println("Valores nulos ou negativos não são aceitos.");
        }
        else {
            this.velocidadeAtual += incremento;
            System.out.println("Vrum vrum, o veículo acelerou! Velocidade atual: " + this.velocidadeAtual);
        }
    }

    //TODO desenvolver teste unitário
    public void reduzirVelocidade(int decremento){
        if (decremento <= 0 ){
            System.out.println("Valores nulos ou negativos não são aceitos.");
        }
        else{
            if (this.velocidadeAtual - decremento <= 0 ){
                this.velocidadeAtual = 0;
                System.out.println("Opa! Essa foi uma freiada bem forte! Velocidade Atual: " + this.velocidadeAtual);
            }
            else {
                velocidadeAtual -= decremento;
                System.out.println("O veículo desacelerou em " + decremento + "km/h. Velocidade atual: " + this.velocidadeAtual);
            }
        }
    }
    public String obterStatus(){
        String statusAtual;

        statusAtual = "\n[obterStatus] " + this.modelo + " " + this.marca + "\nano: " + this.ano;
        statusAtual += "\nVelocidade atual: " + velocidadeAtual;
        statusAtual += "\nVelocidade máxima: " + velocidadeMaxima;

        return statusAtual;
    }

    //Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {

        this.velocidadeAtual = velocidadeAtual;

    }
}

package br.fiap.es2px.model;

/**
 * Classe que abstrai as funcionalidades de um Estacionamento
 */
public class Estacionamento {

    /**
     * Vetor de objetos do tipo Veiculo, para armazenar os veiculos parados dentro do Estacionamento
     */
    private Veiculo[] veiculos;

    /**
     * Atributo que define a quantidade de vagas existentes no estacionamento
     */
    private int qtdVagas;

    /**
     * Atributo que armazena a quantidade de vagas livres no estacionamento
     */
    private int vagasDisponiveis;


    /**
     * Método utilizado para estacionar um novo veículo no estacionamento. Não aceita objetos do tipo Caminhao.
     * @param veiculo veículo a ser estacionado.
     */
    public void estacionarVeiculo(Veiculo veiculo){
        if (veiculo.getClass().getSimpleName() == Caminhao.class.toString()){
            System.out.println("[ERRO] Não existem vagas disponíveis para Caminhões.");
        }
        else{
            if (verificarVagasDisponiveis() == 0){
                System.out.println("[ERRO] Estacionamento cheio. Não é possível estacionar " + veiculo.getModelo());
            }
            else {
                for (int i = 0; i < qtdVagas; i++) {
                    if (veiculos[i] == null){
                        veiculos[i] = veiculo;
                        this.vagasDisponiveis -= 1;
                        return;
                    }
                    else {
                        System.out.println("Vaga " + i + " Veiculo Estacionado:" + veiculos[i].getModelo());
                    }
                }
            }
        }
    }

    /**
     * Método para verificar se existem vagas disponíveis no estacionamento
     * @return int representando a quantidade de vagas livres
     */
    public int verificarVagasDisponiveis(){
        return this.vagasDisponiveis;
    }

    /**
     * Método que imprime relação de vagas livres e ocupadas no estacionamento.
     */
    public void statusEstacionamento(){
        int i = 0;
        for(Veiculo veiculo :veiculos){
            if (veiculo == null){
                System.out.println("Vaga " + i + " livre");
                i++;
            }
            else {
                System.out.println("Vaga " + i + " ocupada: " + veiculo.getModelo());
                i++;
            }
        }
    }


    /**
     * Construtor que recebe como parâmetro o total de vagas existentes no Estacionamento
     * @param qtdVagas
     */
    public Estacionamento(int qtdVagas) {
        this.qtdVagas = qtdVagas;
        this.vagasDisponiveis = qtdVagas;
        this.veiculos = new Veiculo[qtdVagas];
    }


}

import br.fiap.es2px.model.Carro;
import br.fiap.es2px.model.Estacionamento;
import br.fiap.es2px.model.Moto;
import br.fiap.es2px.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen", "Fusca", 1995);
        //System.out.println(veiculo.obterStatus());

        Carro carro = new Carro("Nissan", "Kicks", 2022);
        //System.out.println(carro.obterStatus());

        Moto moto = new Moto("Dafra", "Sitcom 300", 2024);

        Estacionamento estacionamento = new Estacionamento(2);
        //estacionamento.statusEstacionamento();

        estacionamento.estacionarVeiculo(carro);
        //estacionamento.statusEstacionamento();

        estacionamento.estacionarVeiculo(moto);
        estacionamento.statusEstacionamento();

        estacionamento.estacionarVeiculo(veiculo);
        //estacionamento.statusEstacionamento();

    }



}

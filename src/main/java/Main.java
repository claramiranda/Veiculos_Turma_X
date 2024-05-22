import br.fiap.es2px.model.Carro;
import br.fiap.es2px.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo("Volkswagen", "Fusca", 1995);
        //System.out.println(veiculo.obterStatus());

        Carro carro = new Carro("Nissan", "Kicks", 2022);
        //System.out.println(carro.obterStatus());

        carro.ligarAr();
        System.out.println(carro.obterStatus());

        carro.ligarCarro();
        carro.ligarAr();
        System.out.println(carro.obterStatus());

        carro.desligarCarro();
        System.out.println(carro.obterStatus());

    }



}

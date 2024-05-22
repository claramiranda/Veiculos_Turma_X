import br.fiap.es2px.model.Carro;
import br.fiap.es2px.model.Moto;
import br.fiap.es2px.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen", "Fusca", 1995);
        //System.out.println(veiculo.obterStatus());

        Carro carro = new Carro("Nissan", "Kicks", 2022);
        //System.out.println(carro.obterStatus());

        carro.ligarAr();
        //carro.obterStatus();

        carro.ligarCarro();
        carro.ligarAr();
        //carro.obterStatus();

        carro.desligarCarro();
        //carro.obterStatus();

        Moto moto = new Moto("Dafra", "Sitcom 300", 2024);

        //velocidade baixa demais
        moto.empinarMoto();
        moto.obterStatus();

        //velocidade alta dms
        moto.acelerar(80);
        moto.empinarMoto();
        moto.obterStatus();

        //moto empinando
        moto.reduzirVelocidade(30);
        moto.empinarMoto();
        moto.obterStatus();

    }



}

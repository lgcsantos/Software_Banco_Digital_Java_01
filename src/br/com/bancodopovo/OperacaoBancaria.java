package br.com.bancodopovo;

public class OperacaoBancaria {
    public static void main(String[] args) {

        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(Lucas);
        cc.depositar(100);



        ContaPoupanca poupanca = new ContaPoupanca(Lucas);
        poupanca.depositar(200);
        cc.tranferir(50,poupanca);



         // Imprimindo extrados
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}

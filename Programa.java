public class Programa {
    
    public static void main(String[] args) {
        Conta minhaConta;
        Conta minhaConta2;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular="Vitor Rodrigues";
        minhaConta.saldo=1000;
        
        minhaConta2 = new Conta();
        minhaConta2.numero=2;
        minhaConta2.titular="Felipe Rodrigues";
        minhaConta2.saldo=1000;

        System.out.println("\n");

        System.out.println("Número da conta: " + minhaConta.numero);
        System.out.println("Nome do titular: " + minhaConta.titular);
        System.out.println("Saldo da conta: " + minhaConta.saldo);

        System.out.println(" \n");

        System.out.println("Número da conta: " + minhaConta2.numero);
        System.out.println("Nome do titular: " + minhaConta2.titular);
        System.out.println("Saldo da conta: " + minhaConta2.saldo);
    }
}

import java.util.Scanner;

public class SistemaSentinela{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.next();

        System.out.println("Informe o seu cargo: (Cientista, Engenheiro, Zelador, Administrativo) ");
        String cargo = sc.next();

        System.out.println("Informe o seu nivel de acesso de (1 a 10): ");
        int nivelAcesso = sc.nextInt();

        System.out.println("Informe o nivel de sigilo da area que voce quer acessa de (1 a 10): ");
        int nivelSigilo = sc.nextInt();

        System.out.println("Ficha do Fucionario");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo"+cargo);
        
        if (nivelAcesso >= nivelSigilo) {
            System.out.println("Acesso permitido"+" Nivel de autoridade "+nivelAcesso+" - "+nivelSigilo);
        } else if (nivelAcesso < nivelSigilo){
            System.out.println("Acesso Negado");
        } else if (nivelAcesso < 1 || nivelAcesso > 10){
            System.out.println("Erro: Nível de acesso inválido.");
        } else {
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
        }

    


    }
}
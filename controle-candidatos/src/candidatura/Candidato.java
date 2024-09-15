package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    private static int contadorInscricao = 1000; 
    private int numeroInscricao;
    private String nome;
    private double salarioPretendido;

    public Candidato(String nome, double salarioPretendido){
        this.numeroInscricao = contadorInscricao += 1000;
        this.nome = nome;
        this.salarioPretendido = valorPretendido();
    }

    private double valorPretendido(){
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200));
    }
}
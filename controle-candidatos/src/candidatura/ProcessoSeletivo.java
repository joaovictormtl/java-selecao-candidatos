package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        String [] candidatos = {"JOÃO", "LUIZ", "REJANE", "ROSELITO", "YASMIM", "RAYANE", "REGINA", "RICARDO", "MÔNICA", "GABRIEL", "RICARDO", "HENNING", "NICOLAS", "ATHOS", "RAUL", "GUSTAVO", "DAVID", "LUCAS", "ELAINE", "DILERMANDO"};

        String [] selecionados = selecaoCandidatos(candidatos);

    }

    static String [] selecaoCandidatos(String [] candidatos){
        String [] selecionados = new String[5];
        int indice = 0;
        double salarioBase = 2000.0;

        for(int i = 0; i < candidatos.length; i++){
            String candidato = candidatos[i];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato(a) "+candidato+" solicitou R$"+salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato(a) "+candidato+" foi selecionado(a).\n");
                selecionados[indice] = candidato;
                indice++;
                if(indice == 5) break;
            } else{
                System.out.println("Candidato(a) "+candidato+" não foi selecionado(a).\n");
            }
        }
        if(indice < 5){
            System.out.println("Menos de 5 candidatos foram selecionados...");
        }
        
        return selecionados;
    }

    public static void imprimirSelecionados(String [] selecionados){
        for(String selecionado : selecionados){
            System.out.println(selecionado);
        }
    }

    public static double valorPretendido(){
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200));
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }


}

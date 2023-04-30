import java.util.Scanner;
public class github2{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    String nome = scanner.next();
    System.out.println("Informe a sua idade: ");
    int idade = scanner.nextInt();
    int contador = 0;
    boolean erroTentativas = false;
    int porcentagemUm, porcentagemDois, porcentagemTres, porcentagemQuatro;
    String cartao = "", sintomas = "", contato = "", viagem = "";
    
    System.out.println("Nas perguntas a seguir, responda apenas SIM ou NAO.");
        do { // Primeira pergunta
            System.out.println("\nSeu cartão de vacina está em dia? ");
            cartao = scanner.next().toUpperCase();
                if ((cartao.equals("SIM")) || (cartao.equals("NAO"))) {
                break;
                } else {
                contador++;
                System.out.println("Digito inválido");
                if (contador >= 3) {
                erroTentativas = true;
                System.out.println("Não foi possível realizar o diagnóstico.\nGentileza, procurar ajuda médica caso apareça algum sintoma.");
                break;
        }
    }
}while(true);
if (erroTentativas == false){
    do { // Segunda pergunta
        System.out.println("\nTeve algum dos sintomas recentemente?(dor de cabeça, febre, náuse, dor articular, gripe) ");
        sintomas = scanner.next().toUpperCase();
            if ((sintomas.equals("SIM")) || (sintomas.equals("NAO"))) {
            break;
            } else {
            contador++;
            System.out.println("Digito inválido");
            if (contador >= 3) {
            erroTentativas = true;
            System.out.println("Não foi possível realizar o diagnóstico.\nGentileza, procurar ajuda médica caso apareça algum sintoma.");
            break;
        }
    }
}while(true);
if (erroTentativas == false){
    do { //Terceira pergunta
        System.out.println("\nTeve contato com pessoas com sintomas gripais nos úlimos dias?");
        contato = scanner.next().toUpperCase();
            if ((contato.equals("SIM")) || (contato.equals("NAO"))) {
            break;
            } else {
            contador++;
            System.out.println("Digito inválido");
            if (contador >= 3) {
            erroTentativas = true;
            System.out.println("Não foi possível realizar o diagnóstico.\nGentileza, procurar ajuda médica caso apareça algum sintoma.");
            break;
        }
    }
}while(true);
if (erroTentativas == false){
    do { //Quarta pergunta
        System.out.println("\nEstá retornando de viagem realizada no exterior? ");
        viagem = scanner.next().toUpperCase();
            if ((viagem.equals("SIM")) || (viagem.equals("NAO"))) {
                if (viagem.equals("SIM"))
                System.out.println("Você ficará sob observação por 05 dias.");
                break;
            } else {
            contador++;
            System.out.println("Digito inválido");
            if (contador >= 3) {
            erroTentativas = true;
            System.out.println("Não foi possível realizar o diagnóstico.\nGentileza, procurar ajuda médica caso apareça algum sintoma.");
            break;
        }
    }
}while(true);    
}

scanner.close();
if (erroTentativas == true){
    System.out.println("");
} else {
if (cartao.equals("NAO")){
    porcentagemUm = 10;
}else {
    porcentagemUm = 0;
}

if (sintomas.equals("SIM")){
    porcentagemDois = 30;
}else {
    porcentagemDois = 0;
}

if (contato.equals("SIM")){
    porcentagemTres = 30;
}else{
    porcentagemTres = 0;
}

if (viagem.equals("SIM")){
porcentagemQuatro = 30;
}else {
    porcentagemQuatro = 0;
}
int totalPorcentagem = porcentagemUm + porcentagemDois + porcentagemTres + porcentagemQuatro;

if (totalPorcentagem <= 30){
System.out.printf("\nNome: %s\nIdade: %d\nCartão de vacina em dia?: %s\nTeve sintomas recentemente?: %s\nTeve contato com pessoas infectadas?: %s\nEstá retornando de viagem no exterior?: %s\nProbabilidade de estar infectado: %d \nOrientação final: Paciente sob observação.\nCaso apareça algum sintoma, gentileza buscar assistência médica.", nome, idade, cartao, sintomas, contato, viagem, totalPorcentagem);
} else if ((totalPorcentagem > 30) && (totalPorcentagem <= 60)){
System.out.printf("\nNome: %s\nIdade: %d\nCartão de vacina em dia?: %s\nTeve sintomas recentemente?: %s\nTeve contato com pessoas infectadas?: %s\nEstá retornando de viagem no exterior?: %s\nProbabilidade de estar infectado: %d \nOrientação final: Paciente com risco de estar infectado.\nGentileza aguardar em lockdown por 02 dias para ser acompanhado.", nome, idade, cartao, sintomas, contato, viagem, totalPorcentagem);
} else if (totalPorcentagem >= 90){
System.out.printf("\nNome: %s\nIdade: %d\nCartão de vacina em dia?: %s\nTeve sintomas recentemente?: %s\nTeve contato com pessoas infectadas?: %s\nEstá retornando de viagem no exterior?: %s\nProbabilidade de estar infectado: %d \nOrientação final: Paciente crítico!\nGentileza aguardar em lockdown por 10 dias para ser acompanhado.", nome, idade, cartao, sintomas, contato, viagem, totalPorcentagem);
} else {
System.out.println("");
}
}
}
}
}
}

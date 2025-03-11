import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String resp;

        System.out.println("*******************************");
        System.out.println("Faculdade: Unifan");
        System.out.println("Aluno: Thiago Gonçalves Cunha");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Tema das Perguntas: Historia mundial");
        System.out.println("*******************************");


        String[][] questoes = {
                {"Quem foi o primeiro presidente dos Estados Unidos?", "A) George Washington", "B) Thomas Jefferson", "C) Abraham Lincoln", "D) Theodore Roosevelt", "E) John Adams", "A"},
                {"Em que ano terminou a Primeira Guerra Mundial?", "A) 1914", "B) 1918", "C) 1920", "D) 1939", "E) 1945", "B"},
                {"Quem foi o responsável pela unificação da Alemanha no século XIX?", "A) Otto von Bismarck", "B) Karl Marx", "C) Wilhelm II", "D) Napoleão Bonaparte", "E) Friedrich Engels", "A"},
                {"Qual evento marcou o início da Segunda Guerra Mundial?", "A) O ataque a Pearl Harbor", "B) A invasão da Polônia", "C) A queda de Berlim", "D) O Tratado de Versalhes", "E) O lançamento da bomba atômica", "B"},
                {"Qual império dominava o Oriente Médio durante a Idade Média?", "A) Império Romano", "B) Império Otomano", "C) Império Bizantino", "D) Império Persa", "E) Império Mongol", "B"},
                {"Quem foi o líder da Revolução Francesa?", "A) Napoleão Bonaparte", "B) Maximilien Robespierre", "C) Luís XVI", "D) Voltaire", "E) Jean-Jacques Rousseau", "B"},
                {"Em que ano a queda do Muro de Berlim ocorreu?", "A) 1985", "B) 1989", "C) 1991", "D) 1975", "E) 1990", "B"},
                {"Qual civilização antiga construiu as pirâmides no Egito?", "A) Gregos", "B) Romanos", "C) Fenícios", "D) Egípcios", "E) Persas", "D"},
                {"Quem foi o principal líder da independência do Brasil?", "A) Dom Pedro II", "B) Joaquim José da Silva Xavier", "C) Dom Pedro I", "D) Tiradentes", "E) José Bonifácio", "C"},
                {"Onde ocorreu a batalha de Waterloo?", "A) França", "B) Bélgica", "C) Alemanha", "D) Reino Unido", "E) Holanda", "B"},
                {"Qual foi o nome da nave que levou o homem à Lua em 1969?", "A) Apollo 12", "B) Apollo 11", "C) Sputnik 1", "D) Challenger", "E) Voyager", "B"},
                {"Em que ano ocorreu a independência dos Estados Unidos?", "A) 1776", "B) 1800", "C) 1492", "D) 1812", "E) 1845", "A"},
                {"Quem foi o responsável pela invenção da imprensa?", "A) Leonardo da Vinci", "B) Galileu Galilei", "C) Johannes Gutenberg", "D) Isaac Newton", "E) Nikola Tesla", "C"},
                {"Qual país foi o centro do Império Romano?", "A) Grécia", "B) Roma", "C) Egito", "D) Pérsia", "E) França", "B"},
                {"Quem foi o líder da Revolução Russa de 1917?", "A) Josef Stalin", "B) Leon Trotsky", "C) Nicolau II", "D) Vladimir Lenin", "E) Alexander Kerensky", "D"}
        };


        int pontuacao = 0;

        for (String[] questao : questoes) {
            escrevaQuestao(questao);
            do {
                resp = ler.next();
            } while (!respostaValida(resp));

            if (resp.equalsIgnoreCase(questao[6])) {
                pontuacao++;
                System.out.println("Resposta correta!\n");
            } else {
                System.out.println("Resposta errada! A resposta correta era: " + questao[6] + "\n");
            }
        }

        System.out.println("Você acertou " + pontuacao + " de " + questoes.length + " perguntas.");
        ler.close();
    }

    private static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite A, B, C, D ou E.");
        return false;
    }

    private static void escrevaQuestao(String[] questao) {
        System.out.println(questao[0]);
        for (int i = 1; i <= 5; i++) {
            System.out.println(questao[i]);
        }
        System.out.print("\nSua resposta: ");
    }
}

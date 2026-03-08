import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        int disciplinas = 10;
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        System.out.println("quantas disciplinas tem?.");
        disciplinas = scanner.nextInt();
        for (int i = 1; i <= disciplinas; i++) {
            System.out.print("Digite a nota da disciplina " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / disciplinas;
        if (media >= 5) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("O aluno foi reprovado com média: " + media);
        }
        scanner.close();
    }
}

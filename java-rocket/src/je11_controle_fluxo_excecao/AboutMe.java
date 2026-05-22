package je11_controle_fluxo_excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    static void main(String[] args) {
//        criando o objeto scanner

        try (Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US)) {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();
            if (nome.trim().length() <= 3) {
                throw new IllegalArgumentException("Nome inválido! Deve ter pelo menos 3 ou mais caracteres.");
            }


            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();
            if (sobrenome.trim().length() <= 2) {
                throw new IllegalArgumentException("Sobrenome inválido! Deve ter pelo menos 2 ou mais caracteres.");
            }

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            if (idade <= 0 || idade > 135) {
                throw new IllegalArgumentException("Idade inválida!");
            }

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();
            if (altura <= 0.0 || altura > 135) {
                throw new IllegalArgumentException("Altura inválida!");
            }


//        imprimindo os dados obtidos pelo usuário
            System.out.println("\n--- Dados Cadastrados ---");
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.printf("Minha altura é %.2fcm%n", altura);


        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.err.println("Erro de digitação: Os campos Idade e Altura precisam ser números.");

        } finally {
            System.out.println("\nFim do programa.");
        }
    }
}

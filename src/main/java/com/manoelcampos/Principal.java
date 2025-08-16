package com.manoelcampos;

import com.manoelcampos.message.MessageSenderFactory;
import com.manoelcampos.people.Customer;
import com.manoelcampos.message.Newsletter;
import java.util.List;
import java.util.Scanner;
import java.util.List;

/**
 * Executa a aplicação
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        final List<Customer> customers = List.of(
                new Customer("Manoel", "(63) 1111-2222", "manoel@teste.com"),
                new Customer("Breno",  "(63) 3333-4444", "breno@teste.com"),
                new Customer("Raysa",  "(63) 5555-6666", "raysa@teste.com")
        );

        final String msgTemplate = "Aproveite as promoções de natal #name.";

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nEscolha o tipo de mensagem para enviar:");
            System.out.println("1. E-mail");
            System.out.println("2. SMS");
            System.out.println("3. WhatsApp");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            choice = scanner.nextLine();

            Newsletter newsletter;
            switch (choice) {
                case "1":
                    newsletter = new Newsletter(customers, MessageSenderFactory.createSender("email"));
                    System.out.println("\n--- Enviando por E-mail ---");
                    newsletter.send(msgTemplate);
                    break;
                case "2":
                    newsletter = new Newsletter(customers, MessageSenderFactory.createSender("sms"));
                    System.out.println("\n--- Enviando por SMS ---");
                    newsletter.send(msgTemplate);
                    break;
                case "3":
                    newsletter = new Newsletter(customers, MessageSenderFactory.createSender("whatsapp"));
                    System.out.println("\n--- Enviando por WhatsApp ---");
                    newsletter.send(msgTemplate);
                    break;
                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!choice.equals("0"));

        scanner.close();
    }
}
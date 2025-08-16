package com.manoelcampos.message;

import com.manoelcampos.people.Customer;

/**
 * Envia mensagens de email.
 * @author Manoel Campos da Silva Filho
 */
public class Email implements MessageService {
    @Override
    public void send(String message, Customer customer) {
        System.out.printf("Enviando e-mail para %s (%s): %s\n", customer.getName(), customer.getEmail(), message);
    }
}

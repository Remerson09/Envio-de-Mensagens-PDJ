package com.manoelcampos.message;

import com.manoelcampos.people.Customer;

/**
 * Envia mensagens pelo WhatsApp.
 * @author Manoel Campos da Silva Filho
 */
public class WhatsApp implements MessageService {
    /**

     */
    @Override
    public void send(String message, Customer customer) {
        System.out.printf("Enviando WhatsApp para %s (%s): %s\n", customer.getName(), customer.getPhone(), message);
    }
}

package com.manoelcampos.message;

import com.manoelcampos.people.Customer;

/**
 * Envia mensagens pelo Short Message Service (SMS)
 * @author Manoel Campos da Silva Filho
 */
public class Sms implements MessageService {
    @Override
    public void send(String message, Customer customer) {
        System.out.printf("Enviando SMS para %s (%s): %s\n", customer.getName(), customer.getPhone(), message);
    }
}

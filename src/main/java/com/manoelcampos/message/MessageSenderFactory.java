package com.manoelcampos.message;

public class MessageSenderFactory {
    public static MessageService createSender(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new Email();
            case "sms" -> new Sms();
            case "whatsapp" -> new WhatsApp();
            default -> throw new IllegalArgumentException("Tipo de remetente de mensagem inválido: " + type);
        };
    }
}

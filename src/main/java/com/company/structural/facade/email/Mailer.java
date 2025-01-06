package com.company.structural.facade.email;

public class Mailer {
    public static final Mailer MAILER = new Mailer();

    public static Mailer getMailer() {
        return MAILER;
    }

    private Mailer() {}

    public boolean send(Email email) {
        return true;
    }
}

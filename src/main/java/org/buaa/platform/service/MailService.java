package org.buaa.platform.service;

import org.springframework.mail.MailException;

public interface MailService {
    public void sendSimpleMail(String to, String subject, String content) throws MailException;
}

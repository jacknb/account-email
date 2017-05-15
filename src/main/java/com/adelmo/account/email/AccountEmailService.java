package com.adelmo.account.email;

/**
 * Created by znb on 17-5-15.
 */
public interface AccountEmailService {
    public void sendMail(String to, String subject, String text) throws AccountEmailException;
}

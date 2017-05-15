package com.adelmo.account.email;

/**
 * Created by znb on 17-5-15.
 */
public class AccountEmailException extends Exception {
    public AccountEmailException(String message) {
        super(message);
    }

    public AccountEmailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

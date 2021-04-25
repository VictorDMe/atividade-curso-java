package model;

public class AccountException extends RuntimeException{
    private String msg;

    public AccountException(String msg) {
        super(msg);
    }
}

package com.torryharris.exception;

public class WithdrawLimitExceedException extends Throwable {
    public WithdrawLimitExceedException(String message) {
        super(message);
    }
}

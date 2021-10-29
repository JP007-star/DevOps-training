package com.torryharris.driver;

import com.torryharris.exception.InsufficientBalanceException;
import com.torryharris.exception.WithdrawLimitExceedException;
import com.torryharris.model.Person;

public class CustomExceptionDriver {
    public static void main(String[] args) {
        Person jp=new Person("jp",134142521,998899689,100);
        try{
            jp.withdrawalAmount(2339);
        } catch (WithdrawLimitExceedException | InsufficientBalanceException e) {
            System.err.println(e);
        }
        finally {
            System.out.println("This is final statement....");
        }
    }
}

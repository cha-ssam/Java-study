package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println("현재잔액은 " + balance + " 입니다.");
    }

    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("현재 잔액은 " + balance + " 입니다.");
        } else {
            System.out.println("잔액이 부족합니다. ");
        }


    }

}

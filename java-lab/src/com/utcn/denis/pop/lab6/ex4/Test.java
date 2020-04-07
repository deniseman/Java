package com.utcn.denis.pop.lab6.ex4;

import com.utcn.denis.pop.lab6.ex1.BankAccount;
import com.utcn.denis.pop.lab6.ex2.Bank;

public class Test {
    public static void main(String[] args) {
        com.utcn.denis.pop.lab6.ex2.Bank bankAccount=new Bank();
        bankAccount.addAccount("domnie",30312);
        bankAccount.addAccount("feri",310);
        bankAccount.addAccount("meretz",320);
        bankAccount.addAccount("la",414214);
        bankAccount.addAccount("vot",1231);

        bankAccount.printAccounts();
        System.out.println("------------------------------------");
        bankAccount.printAccounts(1000,4000);
        System.out.println("------------------------------------");
        BankAccount boss=bankAccount.getAccount("Boss");
        System.out.println("------------------------------------");
        System.out.println(boss.toString());
        System.out.println("------------------------------------");

    }
}


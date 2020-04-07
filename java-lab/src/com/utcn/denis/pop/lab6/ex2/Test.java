package com.utcn.denis.pop.lab6.ex2;

import com.utcn.denis.pop.lab6.ex1.BankAccount;

public class Test {
    public static void main(String[] args) {
        Bank bankAccount=new Bank();
        bankAccount.addAccount("domnie",30312);
        bankAccount.addAccount("feri",310);
        bankAccount.addAccount("meretz",320);
        bankAccount.addAccount("la",414214);
        bankAccount.addAccount("vot",1231);

        bankAccount.printAccounts();
        System.out.println("------------------------------------");
        bankAccount.printAccounts(1000,4000);
        System.out.println("------------------------------------");
        BankAccount base=bankAccount.getAccount("Base");
        System.out.println("------------------------------------");
        System.out.println(base.toString());
        System.out.println("------------------------------------");

    }
}

package com.cashcounter.queue;
public class Bank {
        int totalAmount = 5000;                              //declared amount
        public void depositAmount(int amountDeposit) {       //user deposit money on cash counter and add that amount in original cash
            totalAmount = totalAmount + amountDeposit;
            System.out.println("total amount" + totalAmount);
        }
         /*
             1.user withdraw money from cash counter and minus that amount in original cash
             2.if user expected more amount rather than amount available in bank ,it showing insufficient balance at cash counter
         */
        public void withdraw(int amountWithDraw) {
            if (amountWithDraw > 5000) {
                System.out.println("insufficient amount in bank ");
            }
            totalAmount = totalAmount - amountWithDraw;
            System.out.println("total amount" + totalAmount);
        }
    }

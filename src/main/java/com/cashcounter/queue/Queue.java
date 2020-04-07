package com.cashcounter.queue;
import java.util.Scanner;
public class Queue
{
        int maximumSize = 10;
        int front = 0;
        int rear = -1;
        int size = 0;
        int array[]=new int[maximumSize];

        public boolean isFull()               //check queue is full or not
        {
            if (size == maximumSize)
            {
                return true;
            }
            return false;
        }
        public boolean ifEmpty()            // check queue is empty or not
        {
            if (size == 0)
            {
                return true;
            }
            return false;
        }
        public void enqueue(int value)      //add value at start position
        {
            if (isFull())
            {
                System.out.println("queue is full");
            }
            rear = (rear + 1) % maximumSize;
            size++;
            array[rear] = value;
        }
        public void dequeue()               //remove value at last position
        {
            if (ifEmpty())
            {
                System.out.println("queue is empty");
            }
            front = front % maximumSize;
            size--;
        }
        public static void main(String args[]) {                // main method
        System.out.println("welcome to Banking Cash Counter");
        /*
          created object of class for accessing method of class
          scanner class object created for taking value from user
          1.first ask how many people in line for cash withdraw or deposit
          2.then select choice if user want to 0)Deposit money then press 0
                                                1)Withdraw money then press 1
        */
         Bank bank = new Bank();
         Queue queue=new Queue();

         Scanner sc = new Scanner(System.in);
         System.out.println("how many people in queue");
         int peopleCount = sc.nextInt();

         while (peopleCount > 0) {
            peopleCount--;
            System.out.println("enter amount user want");
            int amountWant = sc.nextInt();

            System.out.println("ask for choice");
            System.out.println("0.Deposit money");
            System.out.println("1.withdraw money");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    queue.enqueue(amountWant);
                    bank.depositAmount(amountWant);
                    queue.dequeue();
                    break;
                case 1:
                    queue.enqueue(peopleCount);
                    bank.withdraw(amountWant);
                    queue.dequeue();
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }
}





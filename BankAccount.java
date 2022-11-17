import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
class bank{
    int accno=5001;
    int bal;
    bank(int accno,int bal){
        this.accno=accno;
        this.bal=bal;
    }
    void deposit(int a){
        bal=bal+a;
        //  System.out.println("balance ++" + bal);

    }
    void withdraw(int b){
        if(b<bal){
            bal=b-bal;
            System.out.println("done");
        }
        else{

            System.out.println("eroor");
        }

    }

    void show(){
        System.out.println("ACC_NO "+" "+ accno);

        System.out.println("balance is "+"  "+bal);


    }

}
public class two {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        bank b1=new bank(107,89000);
        System.out.println("Bandhan bank");
        char operation;
        System.out.println("select operation + deposit , -  withdraw");
        operation=input.next().charAt(0);




        switch(operation){
            case '+':
                System.out.println("deposit");
                int d=input.nextInt();
                b1.deposit(d);
                break;
            case '-':
                System.out.println("withdraw if u want or blank");
                int x=input.nextInt();
                b1.withdraw(x);
                break;

        }
        b1.show();




        // System.out.println("deposit");
        // int d=input.nextInt();
        // System.out.println("withdraw if u want or blank");
        // int x=input.nextInt();
        // // b1.deposit(d);
        // b1.withdraw(x);


    }

}
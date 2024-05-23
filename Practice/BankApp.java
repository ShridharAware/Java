import java.util.Scanner;
class BankApp{
    public static void main(String []args){
        System.out.println("Bank App");
        int terminate = 0, balance = 0;
        Scanner sc = new Scanner(System.in);
        while(terminate == 0){
            System.out.println("\n1. Deposit\n2. Withdraw");
            int num = sc.nextInt();
            if(!(num == 1 || num == 2)){
                break;
            }
            System.out.print("Enter your amount : ");
            int amount = sc.nextInt();
            switch(num){
                case 1: balance+= amount;
                    System.out.println("Current balance is "+balance);
                    break;
                case 2:
                    if(balance > amount){ 
                        balance-= amount;
                    }else{
                        System.out.println("Insufficient balance.");
                    }
                    System.out.print("Current balance is "+balance);
                    break;
                default:
                    System.out.println("Enter 1 to exit and 0 to continue.");
                    terminate = sc.nextInt();
            }
        }
    }
}
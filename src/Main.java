public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 9");
        System.out.println("Task 1.");
        int [] payments = {10000, 14000, 12000, 19000, 13000};
        int paymentsSum = 0;
        for (int i = 0; i < payments.length; i++) {
            paymentsSum = paymentsSum + payments[i];
        }
        System.out.println(paymentsSum);
        System.out.println(" ");
        System.out.println("Task 2.");
        int minPay = 999999999;
        for (int current : payments){
            if (current < minPay){
                minPay = current;
            }
        }
        System.out.println("minimal pay = " + minPay);
        int maxPay = -1;
        for (int current : payments){
            if (current > maxPay){
                maxPay = current;
            }
        }
        System.out.println("maximal pay = " + maxPay);
        System.out.println(" ");
        System.out.println("Task 3.");
        int [] monthPay = {68000, 72000, 65000, 64000, 71000};
        int monthPaySum = 0;
        for (int a = 0; a < monthPay.length; a++) {
            monthPaySum = monthPaySum + monthPay[a];
        }
        System.out.println("payment for 5 months = " + monthPaySum);
        int averagePay = monthPaySum / monthPay.length;
        System.out.println("average monthly payment = " + averagePay);
        System.out.println(" ");
        System.out.println("Task 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length-1; c >= 0; c--) {
            System.out.print(reverseFullName[c]);
        }
    }
}
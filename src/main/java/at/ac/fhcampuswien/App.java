package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        int numCount=0;
        double num, biggNum=0.0;


        Scanner scan =  new Scanner(System.in);

        while (true) {

            System.out.print("Number " + (numCount + 1) + ": ");

            num = scan.nextDouble();

            if (num <= 0 && numCount == 0) {
                System.out.println("No number entered.");
                break;

            } else if (num <= 0) {
                System.out.println(String.format("The largest number is %.2f", biggNum));
                break;

            } else if (num > biggNum) {
                biggNum = num;
            }

            numCount++;

        }

    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);

        int num =0, a=1;

        System.out.print("n: ");
        num=scanner.nextInt();
        if(num<1){
            System.out.println("Invalid number!");
        }

        for (int i=0; i<num; i++){
            for (int j=0; j<i+1;j++){

                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }

    //todo Task 3
    public void printPyramid() {


        for (int i = 0; i < 6; i++) {

            for (int j = 4-i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    //todo Task 4
    public void printRhombus(){

        int h=0;
        char c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        h=scanner.nextInt();

        System.out.print("c: ");
        c=scanner.next().charAt(0);

        int CAscii=(int)c;
        char b = (char) CAscii;



        // looks if rows are uneven
        if(h%2==0){
            System.out.println("Invalid number!");
        }
        else {


  for(int i=0;i<h/2+1;i++){

            for(int j = 0; j<(h-1)/2-i;j++){
                System.out.print(" ");
            }
            for (int j= i; j > 0 ; j--) {
                    System.out.print((char)(c - j));
            }

            System.out.print(c);

            for (int j= 1; j <= i ; j++) {
                System.out.print((char)(c - j));
            }
            System.out.println();
        }

        for(int i=h/2-1;i>=0;i--){

            for(int j = 0; j<(h-1)/2-i;j++){
                System.out.print(" ");
            }
            for (int j= i; j > 0 ; j--) {
                System.out.print((char)(c - j));
            }

            System.out.print(c);


            for (int j= 1; j <= i ; j++) {
                System.out.print((char)(c - j));
            }
            System.out.println();

            }

        }

    }

    //todo Task 5
    public void marks(){

        int mark =0, count=0, negmrk=0;
        double sum =0;
        Scanner scanner= new Scanner(System.in);

        while(true) {
            System.out.print("Mark " + (count+1) + ": ");
            mark=scanner.nextInt();

            if(mark==0){
                if (count==0) {
                    count++;
                }
                break;
            }
            else if(mark<1||mark>5){
                System.out.println("Invalid mark!");
            }
            else{
                if(mark == 5){
                    negmrk++;
                }
                count++;
                sum+=mark;
            }
        }
        System.out.println(String.format("Average: %.2f\r\nNegative marks: %d",sum/count,negmrk));
    }


    //todo Task 6
    public void happyNumbers(){
        int n = 0, digit = 0, sum = 0
                ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n=scanner.nextInt();

        while (true) {
            if(n==1){
                System.out.println("Happy number!");
                break;
            }
            if(n==4){
                System.out.println("Sad number!");
                break;
            }
            while (n > 0) { //1
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            sum=0;
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
public class Main {
    public static void main(String[] args) {
        int num1 =5;
        int num2 = 10;
        printNumbers(num1 , num2);
        printNumbers(num1 , 2.0);
        printNumbers(2 ,4);


        int sum = add(2 ,4);
        System.out.println(sum);
        System.out.println(add(5,9));

    }
    public static void printNumbers(int num1,int num2){
        System.out.println(num1 + " " + num2);
    }
    public static void printNumbers(int num1,double num2){
        System.out.println(num1 + " " + num2);
    }

    public static int add(int num1,int num2){
       return num1+num2;
    }

}
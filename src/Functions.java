import java.util.Random;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int number = 5;
        int max =  ex5(number);
        ex5(5);
        System.out.println(max);
    }



//    כתבו פונקציה המקבלת שלושה מספרים ומחזירה תשובה חיובית במידה וכל השלושה גדולים מ-10.
    public static boolean ex1a(int num1,int num2,int num3){
        boolean isBiggerThanTen = false;
        if (num1 > 10 && num2>10 && num3 > 10){
            isBiggerThanTen = true;
        }
        return isBiggerThanTen;
    }

    public static boolean ex1b(int num1,int num2,int num3){
        if (num1 > 10 && num2>10 && num3 > 10){
            return true;
        }
        return false;
    }

//    כתבו פונקציה המקבלת שני מספרים שלמים ואז מחזירה תשובה חיובית במידה והמספר
//    הראשון מתחלק במספר השני ללא שארית.

//    public static boolean isADivB()

    public static boolean ex2(int num1 , int num2){
        boolean isDivided = false ;
        if (num1 % num2 == 0){
            isDivided = true;
        }
        return isDivided;
    }


//    כתבו פונקציה המקבלת מספר שלם number ואז מדפיסה number
//    מספרים שלמים אקראיים בטווח של 0 עד number.

    public static void ex4(int numbers){
        Random random = new Random();
        for (int i = 0; i < numbers; i++) {
            int randomNumber = random.nextInt(0 , numbers);
            System.out.println(randomNumber);
        }
    }



    //כתבו פונקציה המקבלת מספר שלם number,
//ואז קולטת מהמשתמש number מספרים נוספים.
//הפונקציה תחזיר את המספר הגבוה ביותר שהוכנס על ידי המשתמש.

    public static int ex5(int number){
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < number; i++) {
          System.out.println("please enter a number");
          int num = scanner.nextInt();
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}



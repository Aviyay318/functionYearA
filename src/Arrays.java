import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();

        //int [] array1 = new int[6];
        //int [] array2 = new int[size];

//        array1[0] = 2;
//        array1[0]++;
//        System.out.println(array2[2]);

       // print1To10();
//        int sum = add(2,3);
//        System.out.println(add(2,5));


        System.out.println("#########");
       int [] array = createArray(5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        int num1 = 3;
        int num2 = 5;
        num1 = ex3(num1);
        System.out.println(num1 + " , " + num2);

        int [] array3 = {2,4,6};
        int sumOfArray = getSum(array3);
        System.out.println(sumOfArray);
        System.out.println("sum of: " +  getSum(array3));
        System.out.println(array3[2]);
//        ex2(array3);
//        for (int i = 0; i < array3.length; i++) {
//            System.out.print(array3[i] + " ");
//        }

        // i -  location / index
        // arr[i] - content

        int [] arr = seqNumber(5,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void ex2(int [] arr){
        arr[0]= 100;
    }
    public static int ex3(int num1){
      num1 = 8;
      return num1;
    }

    public static void print1To10(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }
//
//    כתבו פונקציה המקבלת מערך של מספרים שלמים ומדפיסה את תוכנו. המספרים יודפסו בשורה אחת,
//    כאשר הסימן פסיק מפריד בין כל צמד מספרים.


    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i%2!=0){
                System.out.print(",");
            }
        }
    }


//    כתבו פונקציה המקבלת מספר שלם size, ומחזירה מערך של מספרים שלמים בגודל size.

    public static int [] createArray(int size){
        int [] array = new int[size];
        return array;
    }

//    כתבו פונקציה המקבלת מספר שלם size ומספר עשרוני value. הפונקציה תחזיר מערך בגודל size, שכל תאיו מכילים את הערך value
//        . לדוגמה, אם הפרמטרים המועברים הם 5 ו-3.2,

    public static double [] createArrayBySizeAndValue(int size ,double value){
        double [] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        return array;
    }
//
//    כתבו פונקציה המקבלת מערך של מספרים שלמים ומספר שלם נוסף number, וממלאת
//    את המערך במספרים שלמים אקראיים עד number.
public static void fullArrayInRandomNumbers(int [] arr , int number){
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(number);
    }

}


//    כתבו פונקציה שמקבלת שני פרמטרים, שניהם מספרים שלמים.
//    הפונקציה מחזירה מערך של מספרים, בגודל הפרמטר הראשון, כאשר תאי המערך הם מספרים עוקבים, המתחילים בערך של הפרמטר השני. לדוגמה, אם הפרמטרים המועברים הם 6 ו-4,
//    אזי המערך שנוצר ייראה כך: {4,5,6,7,8,9}.

    public static int [] seqNumber(int num1 , int num2){
        int [] array = new int[num1];
        for (int i = 0; i<array.length;i++){
            array[i] = num2 + i ;
        }
        return array;
    }

    public static int getSum(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //sum+=array[i];
            sum =  sum  +  array[i];
        }
        return sum;
    }
}

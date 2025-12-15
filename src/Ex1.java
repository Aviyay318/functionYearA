public class Ex1 {
    public static void main(String[] args) {
        int [] arr2 = {1,3,4};
      int [] arr =  removeNum(new int[]{1,2,3},3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //יש לכתוב פונקציה שמקבלת מערך של מספרים ומספר ומחזירה מערך ללא המספר
    public static int [] removeNum(int [] arr ,int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num){
                count++;
            }
        }
        int [] resultArr = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num){
              resultArr[resultIndex] = arr[i];
              resultIndex++;
            }
        }
        return resultArr;
    }

    //יש לכתוב פונקציה שמקבלת מערך של מחזורות
    // ותו ומחזירה מערך של מחזרות ללא המחזורות שהתו הזה קיים בהם יותר מפעמיים

    public static String [] function(String [] strArr , char c){
        int countOfChar = 0;
        int sizeOfNewArrCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            countOfChar =  0;
            for (int j = 0; j < strArr[i].length(); j++) {
                 String str = strArr[i];
                 if (str.charAt(j)==c){
                     countOfChar++; // 3
                 }
            }
           if (countOfChar<=2){
               sizeOfNewArrCount++;
           }

        }

        String [] newArr = new String[sizeOfNewArrCount];
        int newIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            countOfChar =  0;
            for (int j = 0; j < strArr[i].length(); j++) {
                String str = strArr[i];
                if (str.charAt(j)==c){
                    countOfChar++; // 3
                }
            }
            if (countOfChar<=2){
              newArr[newIndex] = strArr[i];
              newIndex++;
            }

        }
        return newArr;
    }
}

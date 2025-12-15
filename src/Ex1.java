public class Ex1 {
    public static void main(String[] args) {

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
}

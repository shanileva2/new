public class Main {

   // לולאה לבדיקת מספר מספרים גדלים בטווח
    static int totalIncreasing (double num) {
        int totalNumbers=0;
        //לולאה שעוברת על כל המספרים בטווח
        for (int i=0; i<num; i++) {
            //מספר ספרות במספר
            int length = (int) (Math.log10(i) + 1);
            // בדיקה לכל ספרה
            //if(){}
            //בדיקה האם החוקיות התקיימה בכל הספרות
            // if(){
            // totalOccurrences = totalOccurrences ++;
            //}
        }
        return totalNumbers;
    }

    //לולאה לבדיקת מספר מספרים קטנים בטווח
    static int totalDecreasing (double num) {
        int totalNumbers=0;
        //כמו בפונקציה הקודמת עם שינויים לבדיקת ירידה ולא עלייה
        return totalNumbers;
    }

    static int totalIncDec (int x){
        double numToCheck = Math.pow(10,x);
        int totalInc = totalIncreasing(numToCheck);
        int totalDec = totalDecreasing(numToCheck);
        int totalOccurrences = totalDec + totalInc ;
        return totalOccurrences;
    }

    public static void main(String[] args) {
        //לא נדרש לבדוק תקינות של ערך x
        totalIncDec(10);
    }
}

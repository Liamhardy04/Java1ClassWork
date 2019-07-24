
package Arrays;

public class Quiz {

    public static void main(String[] args) {
       /* int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 5;
        myArray[3] = 7;
        myArray[4] = 9;
        myArray[5] = 11;
        myArray[6] = 13;
        myArray[7] = 15;
        myArray[8] = 17;
        myArray[9] = 19;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray[5]);
        System.out.println(myArray[6]);
        System.out.println(myArray[7]);
        System.out.println(myArray[8]);
        System.out.println(myArray[9]);
        int[] myArray2 = new int[20];
        int count = 0;
        int oddCount = 1;
        while (count < 19) {
            myArray2[count] = oddCount;
            oddCount = (oddCount + 2);
            System.out.println(myArray2[count]);
            count++;
        }*/
        int[] myArray3 = new int[1000];
        int count = 0;

        while (count < 1000) {
        int count2 = 0;
        
        while (count2 < 20) {
            int number = (int)(Math.random() * 1000 + 1);
            myArray3[count] = number;
            System.out.print(myArray3[count]);
            count2 ++;
            count++;
            System.out.print(" ");
        }
        System.out.println("");
        
        }
        
        }
  
    }
    


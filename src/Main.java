import java.util.Random;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        /*int a1 = 67;
        int a2 = 56;
        int a3 = 45;
        int a4 = 43;
        int[] massiv = {67,56,45,43};
        double[] arrayDouble = new double[]{45.4,43.4,2.5};
        byte[] arrayByte = new byte[]{2,3,4,5,7,8,6,7,8,5,4,3,2,8};
        int[] arrayInt = new int[5];// 0 1 2 3 4
        String[] arrayString ={"Айбек","Максат"};
     //   System.out.println(arrayInt.length); // канча ячейкага бар экенин текшерет
        arrayInt[0]=20;
        arrayInt[3]=20;
        System.out.println(arrayInt[3]);*/
//------ТАПШЫРМА
        /** int[] arrayInt = new int[5];
         arrayInt[0]=30;
         arrayInt[1]=89;
         arrayInt[2]=67;
         arrayInt[3]=56;
         arrayInt[4]=78;
         System.out.println(arrayInt[0]);**/
    /*int[] array = new int[]{1,2,3,4,5,6,89,8,9,10,11,12,13};

        for (int i = 5; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
//        Random rn = new Random();
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = rn.nextInt(100);
//            System.out.println(array[i]);
//
//        }
//
//        Random random = new Random();
//        int[] array = new int[10];
//        double summa = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10, 100);
//            summa += array[i];
//            System.out.println(array[i]);
//        }
//        System.out.println("Арифметикалык саны:"+summa/array.length);
        /**Random random = new Random();
         int[] array = new int[20];
         double summChon = 0;
         double suummKich = 0;
         int count1 = 0;
         int count2 = 0;

         for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(100);
         if (array[i] > 50) {
         summChon += array[i];
         count1++;
         } else if (array[i] < 50) {
         suummKich += array[i];
         count2++;
         }
         }
         System.out.println("count1:" + count1);

         System.out.println(" 50дөн чоң сандардын ариф орточо суммасы :" + summChon / count1);

         System.out.println("count2 " + count2);

         System.out.println("50дөн кичине сандардын ариф  орточо суммасы :" + suummKich / count2);**/


//-------------------------------------- ТАПШЫРМА 1 ---------------------------------------------

        /*Random random = new Random();

        int[] array = new int[20];
        int counter = 0;



        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(170, 220);
            System.out.print(array[i]+ " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 180 && array[i] < 190) {
                System.out.print(array[i] + " ");

                counter++;
            }
        }

       System.out.println("\n\"МАССИВДИН ИЧИНДЕ 180ДЕН ЧОҢ ЖАНА 190ДОН КИЧҮҮ #"+ counter +"\tЭЛЕМЕНТ БАР\"");*/
        /*Random ran = new Random();
        int[] array = new int[5];
        int[] array1 = new int[5];
        int summa = 0;
        int summa1 = 0;
        double counter = 0;
        double counter1 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1, 5);
            summa += array[i];
            counter = (double) summa / array.length;
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ran.nextInt(1, 5);
            summa1 += array1[i];
            counter1 = (double) summa1 / array1[i];


            if (counter > counter1) {
                counter += array[i];

            } else {
                counter1 += array1[i];
            }
        }
            System.out.println("array суммасы:" + summa + "\nАрифметикалык саны:" + counter);
            System.out.println("array1 суммасы:" + summa1 + "\nАрифметикалык саны:" + counter1);*/
        Random random = new Random();
        int[] array = new int[111];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(111,1000);
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
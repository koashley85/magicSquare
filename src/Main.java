/*
Written by Kavion Ashley
This program will calculate and fill in the magic square
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int finalTotal=0;
        int missingValue4, a=54,b=12,c=39,d,e,f;
        Scanner userIn = new Scanner(System.in);
        int[] column1 = {a,0,33,18};
        int[] column2 = {b,c,27,0};
        int[] diagnal = {a,c,24,0};
        int[] firstRow = {a,b,0,0};
        int[] secondRow = {0,c,0,30};
        int[] thirdRow = {33,27,24,42};
        int[] fourthRow = {18,0,0,0};
        int totalRow1 = firstRow();
        if (totalRow1>finalTotal){
            finalTotal=totalRow1;
        }
        System.out.println();
        int totalRow2 = secondRow();
        if (totalRow2>finalTotal){
            finalTotal=totalRow2;
        }
        System.out.println();
        int totalRow3 = thirdRow();
        if (totalRow3>finalTotal){
            finalTotal=totalRow3;
        }
        // System.out.println();
        int totalRow4=fourthRow();
        // System.out.println();
        //  System.out.println(finalTotal);
        // System.out.println(c2);
        column1=firstMissingValue1(finalTotal);
        column2=firstMissingValue2(finalTotal);
        diagnal=firstMissingValue3(finalTotal);
        missingValue4= (finalTotal-diagnal[3]-thirdRow[3]-secondRow[3]);
        // System.out.println(missingValue4);

        secondRow[0]=column1[1];
        fourthRow[1]=column2[3];
        fourthRow[3]=diagnal[3];
        firstRow[3]=missingValue4;
        firstRow[2]=(finalTotal-firstRow[0]-firstRow[1]-firstRow[3]);
        secondRow[2]=(finalTotal-secondRow[0]-secondRow[1]-secondRow[3]);
        fourthRow[2]=(finalTotal-fourthRow[0]-fourthRow[1]-fourthRow[3]);

        for (int i = 0; i < 4; i++) {
            System.out.print(firstRow[i] + " \t");

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(secondRow[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(thirdRow[i] +"\t");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(fourthRow[i] +"\t");
        }

    }
    public static int firstRow(){
        int[] Rows1 = new int[4];
        int totalRow1=0;

        Rows1[0]=54;Rows1[1]=12;
        for (int i = 0; i < 4; i++) {
            System.out.print(Rows1[i] +"\t");
            totalRow1+=Rows1[i];
        }
        return totalRow1;
    }
    public static int secondRow(){
        int[] Rows2 = new int[4];
        int totalRow2=0;
        Rows2[1]=39;Rows2[3]=30;
        for (int i = 0; i < 4; i++) {
            System.out.print(Rows2[i] +"\t");
            totalRow2+=Rows2[i];
        }
        return totalRow2;
    }
    public static int thirdRow(){
        int[] Rows3 = new int[4];
        int totalRow3=0;
        Rows3[0]=33;Rows3[1]=27;Rows3[2]=24;Rows3[3]=42;
        for (int i = 0; i < 4; i++) {
            System.out.print(Rows3[i] +"\t");
            totalRow3+=Rows3[i];
        }
        System.out.println();
        return totalRow3;
    }
    public static int fourthRow(){
        int[] Rows4 = new int[4];
        int totalRow4=0;
        Rows4[0]=18;
        for (int i = 0; i < 4; i++) {
            System.out.print(Rows4[i] +"\t");
            totalRow4 += Rows4[i];
        }
        System.out.println();
        System.out.println();
        return totalRow4;
    }
    public static int firstColumn(int finalTotal){
        int[] column1 = new int[4];
        column1[0]=54;column1[1]=0;column1[2]=33;column1[3]=18;
        int missingValue=0;int totalColumn1=0;
        for (int i = 0; i < 4; i++) {
            totalColumn1+=column1[i];
        }
        return finalTotal-totalColumn1;
    }
    public static int[] firstMissingValue1(int finalTotal){
        int[] column1 = new int[4];
        column1[0]=54;column1[1]=0;column1[2]=33;column1[3]=18;
        column1[1]=finalTotal-column1[0]-column1[2]-column1[3];
        // System.out.println(column1[1]);
        return column1;
    }
    public static int[] firstMissingValue2(int finalTotal){
        int[] column2 = new int[4];
        column2[0]=12;column2[1]=39;column2[2]=27;column2[3]=0;
        column2[3]=finalTotal-column2[0]-column2[1]-column2[2];
        //System.out.println(column2[3]);
        return column2;
    }
    public static int[] firstMissingValue3(int finalTotal){
        int[] diagnal = new int[4];
        diagnal[0]=54;diagnal[1]=39;diagnal[2]=24;diagnal[3]=0;
        diagnal[3]=finalTotal-diagnal[0]-diagnal[1]-diagnal[2];
        //System.out.println(column2[3]);
        return diagnal;
    }


}



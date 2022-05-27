import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] arrB=new String[7][4];
        for(int row=0;row<arrB.length;row++){
            for(int col=0;col<arrB[row].length;col++){
                if(row==0 || row==3 || row==6){
                    arrB[row][col]="*";
                }
                else if(col==0 || col==3){
                    arrB[row][col]="*";
                }
                else{
                    arrB[row][col]=" ";
                }
            }
        }
        for(String[] row:arrB){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

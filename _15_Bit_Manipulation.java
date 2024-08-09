
/**
 **** Bit Manipulation ****
 * 1. GET Bit
 * 2. SET Bit
 * 3. CLEAR Bit
 * 4. UPDATE Bit
 */



public class _15_Bit_Manipulation {
    public static void main(String[] args){


        //  GET Bit
        int n = 5; // 0101
        int pos = 4;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
        System.out.println("bit was zero");
        }else{
        System.out.println("Bit was one");
        }


        // SET Bitw
        int n1 = 4;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
        System.out.print(bitMask1 | n1);


        // CLEAR Bit
        int n2= 5;
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        System.out.print(~(bitMask2) & n2);


        // UPDATE Bit
        int n3 = 5;
        int pos3 = 0;
        int updateTo = 0;
        int bitMask3 = 1<<pos3;
        if(updateTo == 0){
            // CLEAR Bit
            System.out.print(~(bitMask3) & n3);
        }else{
            // SET Bit
            System.out.print(bitMask3 | n3);
        }
    }
}
    
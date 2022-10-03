import org.w3c.dom.ls.LSOutput;

public class Exercise9 {
    public static void main(String[] args) {
        boolean thereWasOne;
        int countRowsAll0 = 0, countColsAll0 = 0;
        int[][] array = new int[10][10];// Declaration and instantiation
        // Initialization
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = 0;
            }
        }
        array[0][4] = 1;
        array[2][6] = 1;
        array[3][1] = 1;
        array[8][6] = 1;

        for (int row = 0; row < array.length; row++) {
            thereWasOne = false;
            for (int col = 0; col < array[0].length; col++) {
                if (array[row][col] == 1){
                    thereWasOne = true;
                    break;
                }
            }
            if (!thereWasOne) {
                countRowsAll0++;
            }
        }
        System.out.println("N. rows all 0: " + countRowsAll0);

        for (int col = 0; col < array[0].length; col++) {
            thereWasOne = false;
            for (int row = 0; row < array.length; row ++) {
                if(array[row][col] == 1) {
                    thereWasOne = true;
                    break;
                }
            }
            if (!thereWasOne) {
                countColsAll0++;
            }
        }
        System.out.println("N. cols all0: " + countColsAll0);
    }
}
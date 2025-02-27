
public class _1_PrintBinary {

    /// 打印一个数字的二进制表示
    public static void printBinary(int number){
        for (int i = 31; i >= 0 ; i--) {
            System.out.print( (number & (1<<i)) == 0 ? 0 : 1 );
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printBinary(5);
        printBinary(10);

    }

}


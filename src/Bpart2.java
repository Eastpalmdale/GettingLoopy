public class Bpart2 {
    public static void main(String[] args) {
        for (int row  = 0; row <= 5; row += 1) {

            for(int col = 5; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}

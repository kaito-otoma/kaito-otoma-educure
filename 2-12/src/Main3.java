public class Main3 {
    public static void main(String[] args) {
        int height = 5; // ピラミッドの高さ
        for (int floor = 1; floor <= height; floor ++ ){
        for (int space = 1; space <= (height - floor); space++){
            System.out.print(" ");
        }

        for (int blocs = 1; blocs <= (floor * 2 - 1); blocs++){ 
             System.out.print("*");
        }
            System.out.println("");
            }
        
    }
}

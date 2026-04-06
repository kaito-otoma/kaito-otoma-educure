public class Main4 {
    public static void main(String[] args) {
        int side1 = 1;
        int side2 = 2;
        int side3 = 10;
        double sideA = 1.414;
        
        if (side1 == side2 && side1 == side3) {
            System.out.println("正三角形");
        } else if (side1 == side2 && side3 == sideA ) {
            System.out.println("直角二等辺三角形");
        } else if (side1 == side2 && side1 != side3) {
            System.out.println("二等辺三角形");
        } else if (side2 == side3 && side2 != side3) {
            System.out.println("二等辺三角形");
        } else if (side1 == side3 && side2 != side3) {
            System.out.println("二等辺三角形");
        } else if (side1 * side1 + side2 * side2 == side3 * side3) {
            System.out.println("直角三角形");
        } else if (side1 != side2 && side1 != side3 && side2 != side3 && side1 + side2 > side3) {
            System.out.println("不等辺三角形");
        } else {
            System.out.println("三角形ではない");
        }
            
    }
}
 
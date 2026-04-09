public class Main4 {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
       
        int shortSide = 0;   
        int middleSide = 0;   
        int longSide = 0;     

        if (side1 > side2) {
            if (side1 > side3) {
                longSide = side1;
                if (side2 > side3) {
                    middleSide = side2;
                    shortSide = side3;
                } else {
                    middleSide = side3;
                    shortSide = side2;
                }
            } else {
                longSide = side3;
                middleSide = side1;
                shortSide = side2;
            }
        } else {
            if (side2 > side3) {
                longSide = side2;
                if (side1 > side3) {
                    middleSide = side1;
                    shortSide = side3;
                } else {
                    middleSide = side3;
                    shortSide = side1;
                }
            } else {
                longSide = side3;
                middleSide = side2;
                shortSide = side1;
            }
        }

        //三角形種類判定
        if (shortSide + middleSide < longSide) {
            System.out.println("三角形ではない");
        } else if (shortSide == middleSide && middleSide == longSide) {
            System.out.println("正三角形");
        } else {
            if (shortSide == middleSide || middleSide == longSide) {
                if (shortSide * shortSide + middleSide * middleSide == longSide * longSide) {
                    System.out.println("直角二等辺三角形");
                } else {
                    System.out.println("二等辺三角形");
                }
            } else if (shortSide * shortSide + middleSide * middleSide == longSide * longSide) {
                System.out.println("直角三角形");
            } else {
                System.out.println("不等辺三角形");
            }
        }
    }
}

 
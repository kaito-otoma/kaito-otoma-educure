package Main2;

public class Main2 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        ArrayAccessor accessor = new ArrayAccessor(data);

        System.out.println("位置1の要素\n" + accessor.getElement(1));
        System.err.println("位置5の要素\n" + accessor.getElement(5));
    }
}

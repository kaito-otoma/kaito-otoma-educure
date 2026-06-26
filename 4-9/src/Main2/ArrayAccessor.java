package Main2;

public class ArrayAccessor {
    int [] array;

    public ArrayAccessor(int[] array){
        this.array = array;
    }
    public String getElement(int index){
        try{
            return String.valueOf(array[index]);
        }catch(ArrayIndexOutOfBoundsException error) {
            return "エラー：指定された位置は範囲外です";
        }
    }
}

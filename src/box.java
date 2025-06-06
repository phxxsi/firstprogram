public class box {public class Box {

    private int length;              // довжина коробки
    public double capacity;          // ємність коробки
    protected char colorChar;        // символ кольору коробки: 'r' - red, 'b' - black

    String string;                   // довільний рядок

    public void createBox(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

    public static int methodName() {
        int result = 1;

        return result;
    }
}

}

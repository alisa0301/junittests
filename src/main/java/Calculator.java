public class Calculator {


    public int divide(Integer a, Integer b) {
        if (b==0) {
            throw new IllegalArgumentException("Не дели на ноль, дурачок!");
        }
        return a/b;
    }
}

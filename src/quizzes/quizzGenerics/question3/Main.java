package quizzes.quizzGenerics.question3;

public class Main<T> {
    private T t;
    public void set(T t) {this.t = t;}

    public T getT() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
    }

    public static void main(String[] args) {
        Main<Integer> box = new Main<Integer>();
        box.set(10);
//        box.inspect(new Number("12"));
    }
}

package quizzes.quizzGenerics.question1;

public class Main {
    public static void main(String[] args) {
        MyGen<Integer> m = new MyGen<Integer>();
//        m.set("merit");
//        System.out.println(m.get());
    }

    static class MyGen<T> {
        T var;
        void set(T var) {
            this.var = var;
        }

        T get() {
            return var;
        }
    }
}

package patterns.observer;

class Student implements Observer {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.name + " learned about " + message);
    }

    public void listenTo(ObserverSubject obj) {
        obj.register(this);
    }
}
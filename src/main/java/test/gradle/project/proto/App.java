package test.gradle.project.proto;

public class App {
    public Greeting getGreeting() {
        return Greeting.newBuilder().setMessage("hello").build();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting().getMessage());
    }
}

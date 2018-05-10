package pl.kkiljan.lesson20;


public class AnonymousClasses {
    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule {
        void sayHello();
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot johannes = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("hyvää huomenta");
            }
        });

        jan.saySomething();
        john.saySomething();
        johannes.saySomething();

    }
}
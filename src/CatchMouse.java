/**
 * Created by zym on 15-5-31.
 */
public class CatchMouse {

    static class Cat {
        //static String name = "Tom";
        static String name;
        static void mew() {
            System.out.println("mew mew!");
        }

        void catchMouse(Mouse mouse) {
            Cat.mew();
            System.out.println("I'm " + Cat.name);
            mouse.squeak();
            System.out.println("I'm " + Mouse.name);
        }
    }

    static class Mouse {
        static String name;

        void squeak() {
            System.out.println("zhi zhi!!");
        }
    }

    public static void main(String[] args) {
        Cat Tom = new Cat();
        Tom.name="Tom";
        Mouse Jerry = new Mouse();
        Jerry.name="Jerry";
        Tom.catchMouse(Jerry);

    }
}

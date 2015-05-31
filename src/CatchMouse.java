/**
 * Created by zym on 15-5-31.
 */
public class CatchMouse {

    static class Cat {
        static String name = "Tom";

        static void mew() {
            System.out.println("mew mew!");
        }

        void CatchMouse(Mouse mouse) {
            Cat.mew();
            System.out.println("I'm " + Cat.name);
            mouse.squeak();
            System.out.println("I'm " + Mouse.name);
        }
    }

    static class Mouse {
        static String name = "Jerry";

        void squeak() {
            System.out.println("zhi zhi!");
        }
    }

    public static void main(String[] args) {
        Cat Tom = new Cat();
        Mouse Jerry = new Mouse();
        Tom.CatchMouse(Jerry);

    }
}

package book.core.java.Reflection;

import book.core.java.ClassTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-7.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a class name: ");
        String name = in.next();

        try{
                Class cl = Class.forName(name);
                Class spcl = cl.getSuperclass();
                String modifiers = Modifier.toString(cl.getModifiers());
                if(modifiers.length() > 0){
                    System.out.printf(modifiers + " ");
                }
                System.out.printf("class " + name);
                if(spcl == null && spcl != Object.class){
                    System.out.println(" extends " + spcl.getName());
                }
            System.out.printf("\n{\n");
            System.out.println("    //Constructor");
            printConstructors(cl);
            System.out.println();
            System.out.println("    //Methods");
            printMethods(cl);
            System.out.println();
            System.out.println("    //Fields");
            printFields(cl);
            System.out.printf("\n}\n");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c : constructors){
            String name = c.getName();
            System.out.printf("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0){
                System.out.printf(modifiers + " ");
            }
            System.out.printf(" " + name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if(j > 0){
                    System.out.printf(", ");
                }
                System.out.printf(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        for(Method m : methods){
            Class Type = m.getReturnType();
            String name = m.getName();
            System.out.printf("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0){
                System.out.printf(modifiers + " " +Type);
            }
            System.out.printf(" " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if(j > 0){
                    System.out.printf(", ");
                }
                System.out.printf(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for(Field f : fields){
            Class Type = f.getType();
            String name = f.getName();
            System.out.printf("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0){
                System.out.printf(modifiers + " ");
            }
            System.out.println(Type.getName() + " " + name + ";");
        }
        System.out.println();
    }
}

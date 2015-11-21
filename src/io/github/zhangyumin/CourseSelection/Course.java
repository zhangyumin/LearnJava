package io.github.zhangyumin.CourseSelection;

import java.util.ArrayList;
import java.util.List;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-11-21.
 */
public class Course {
    public int id;
    public String name;
    List Courses = new ArrayList();
    public void add(){
        Courses.add(id-1,name);
        System.out.println("id:" + (id) + " name:" + name);
    }
    public Course(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){
        Course c = new Course(1,"C语言");
        c.add();
    }
}

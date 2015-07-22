package io.github.zhangyumin.exception;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-7-22.
 */
class MyException extends Exception {
    private int id;
    public MyException(String message,int id){
        super(message);
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

class Test{
    public void regist(int num) throws MyException{
        if(num<0){
            throw new MyException("1error",3);
        }
        System.out.println("people "+num);
    }
    public void manager(){
        try {
            regist(-8);
        }
        catch (MyException e){
            System.out.println("2error :"+e.getId());
            e.printStackTrace();
        }
        System.out.print("over");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.manager();
    }
}

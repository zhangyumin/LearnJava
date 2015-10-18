/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-18.
 */
public class ProducerConsumer {
    public static void main(String args[]){
        container ct = new container();
        Consumer cs = new Consumer(ct);
        Producer pd = new Producer(ct);
        new Thread(cs).start();
        new Thread(pd).start();
    }
}
class Producer implements Runnable{
    container c = null;
    Producer(container c){
        this.c = c;
    }
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            baozi bz = new baozi(i);
            c.push(bz);
            System.out.println("push:"+i);
            try {
                Thread.sleep((int)(500*Math.random()));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable{
    container c = null;
    Consumer(container c){
        this.c = c;
    }
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            baozi bz = c.pop();
            System.out.println("pop"+i);
            try {
                Thread.sleep((int)(1000*Math.random()));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class baozi{
    int id;
    baozi(int id){
        this.id = id;
    }
}
class container{
    int index = 0;
    baozi[] ct = new baozi[10];
    public synchronized void push(baozi bz){
        if(index == ct.length){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notify();
        ct[index] = bz;
        index++;
    }
    public synchronized baozi pop(){
        if(index == 0){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return ct[index];
    }
}

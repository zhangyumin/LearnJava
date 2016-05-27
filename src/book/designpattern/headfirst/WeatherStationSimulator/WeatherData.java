package book.designpattern.headfirst.WeatherStationSimulator;

import java.util.ArrayList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-5-11.
 */
public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    ArrayList observers = new ArrayList();

    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObersers() {
        for (int i = 0; i < observers.size(); i++) {
            ((Observer)observers.get(i)).update(this.temp, this.humidity, this.pressure);
        }
    }

    public void setMeasure(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void measureChanged(){
        this.notifyObersers();
    }
}

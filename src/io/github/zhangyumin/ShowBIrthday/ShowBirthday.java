package io.github.zhangyumin.ShowBIrthday;

/**
 * Created by zym on 15-5-31.
 */
class BirthDate{
    private int day;
    private int month;
    private int year;
    public BirthDate(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
    public void setDay(int d){
        day = d;
    }
    public void setMonth(int m){
        month = m;
    }
    public void setYear(int y){
        year = y;
    }
    public int getDay(int d){
        return day;
    }
    public int getMonth(int m){
        return month;
    }
    public int getYear(int y){
        return year;
    }
    public void display(){
        System.out.println(day+"-"+month+"-"+year);
    }
}



public class ShowBirthday {
    public static void main(String[] args){
        ShowBirthday showBirthday = new ShowBirthday();
        int date = 8;
        BirthDate d1 = new BirthDate(7,7,1970);
        BirthDate d2 = new BirthDate(1,1,2000);
        showBirthday.change1(date);
        showBirthday.change2(d1);
        showBirthday.change3(d2);
        System.out.println("date= "+date);
        d1.display();
        d2.display();
    }
    public void change1(int i){
        i=1234;
    }

    public void change2(BirthDate b){
        b = new BirthDate(22,2,2004);
    }

    public void change3(BirthDate b){
        b.setDay(23);
    }
}

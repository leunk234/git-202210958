import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer PC = new PersonalComputer();
        PC.turnOn();
        PC.printInfo();
        }
    }

class PersonalComputer{
    private Monitor monitor;
    private Computer computer;
    public PersonalComputer(){
        this.computer= new Computer("Core i7","32GB","2TB","White","700W");
        this.monitor= new Monitor("32 inch","Black","45W");
    }
    public void turnOn(){
        this.computer.turnOn();
        this.monitor.turnOn();
    }
    public void printInfo(){
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    public Monitor(String ms, String c, String p){
        monitorSize=ms;
        color=c;
        power=p;
}
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public Computer(String cp, String m, String h, String c, String p){
        cpu=cp;
        memory=m;
        hd=h;
        color=c;
        power=p;
    }
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);

    }
}
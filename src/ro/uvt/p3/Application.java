package ro.uvt.p3;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }

    public void run(){
        Banana b = new Banana(30,50,20);
        Apple a1 = new Apple(30,50,20, Fruit.Color.red);
        Apple a2 = new Apple(35,45,24, Fruit.Color.green);


    }
}

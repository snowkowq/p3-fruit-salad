package ro.uvt.p3.io;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Fruit;

public class InputDevice {

    public String nextLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }
    public Fruit[] readFruit()
    {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Apple(100,20,70, Fruit.Color.red);
        fruits[1] = new Banana(45,30,50);
        fruits[2] = new Banana(47,31,56);
        fruits[2] = new Apple(92,46,74, Fruit.Color.green);
        fruits[3] = new Apple(94,47,78, Fruit.Color.green);
        fruits[4] = new Apple(99,47,71, Fruit.Color.green);
        return fruits;
    }

}

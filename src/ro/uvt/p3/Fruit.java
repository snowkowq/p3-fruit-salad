package ro.uvt.p3;
public class Fruit {
    int weight;
    int SugarContent;
    int WaterContent;
    Color color;

    public Fruit(int weight, int sugarContent, int waterContent, Color color) {
        this.weight = weight;
        SugarContent = sugarContent;
        WaterContent = waterContent;
        this.color = color;
    }

    public enum Color{
        red, yellow, green, pink
    }
}

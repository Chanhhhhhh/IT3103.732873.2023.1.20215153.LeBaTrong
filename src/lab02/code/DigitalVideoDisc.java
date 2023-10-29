package lab02.code;

public class DigitalVideoDisc {
    private  String title;
    private  String category;
    private String director;
    private  int length;
    private  float cost;

    // constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    // constructor
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // constructor
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    // constructor
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLenght() { return length;}

    public float getCost() {
        return cost;
    }
}

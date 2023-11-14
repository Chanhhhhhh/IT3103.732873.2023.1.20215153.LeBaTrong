package hust.soict.dsai.Aims.disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;


    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "DVD - " + this.title + " - " + this.category +
                (this.director != null ? " - " + this.director : "") +
                (this.length > 0 ? " - " + this.length : "") +
                ": " + this.cost + "$";
    }
}

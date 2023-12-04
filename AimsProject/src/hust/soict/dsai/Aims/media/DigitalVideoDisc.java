package hust.soict.dsai.Aims.media;
import hust.soict.dsai.Aims.media.Media;
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost,director,length);
    }
    @Override
    public String toString() {
        return "DVD - " + super.getTitle() + " - " + super.getDirector() +
                (super.getDirector() != null ? " - " + super.getDirector() : "") +
                (super.getLength() > 0 ? " - " + super.getLength() : "") +
                ": " + super.getCost() + "$";
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
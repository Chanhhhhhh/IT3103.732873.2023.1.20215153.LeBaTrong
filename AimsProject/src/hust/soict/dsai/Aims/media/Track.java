package hust.soict.dsai.Aims.media;

import java.util.Objects;
import hust.soict.dsai.aims.exception.PlayerException;


public class Track implements Playable{
     private  String title;
     private  int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public  Track(String title){
        this.title = title;
    }
    public  Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    @Override
    public String play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing track: " + this.getTitle());
            System.out.println("Track length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: track length is non-positive!");
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            return Objects.equals(this.title, ((Track) obj).title)
                    && this.length == ((Track) obj).length;
        }
        return false;
    }

}

package hust.soict.dsai.Aims.media;
import hust.soict.dsai.aims.exception.PlayerException;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends  Disc implements Playable{
    private  String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);
    }

    public CompactDisc(String artist,String title, String category, float cost, String director, int length) {
        super(title, category, cost, director, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exist!");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Remove author successfully!");
        }
    }
    @Override
    public int getLength() {
        int res = 0;
        for (Track track : tracks) res += track.getLength();
        return res;
    }

    @Override
    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() +
                (this.getDirector() != null ? " - " + this.getDirector() : "") +
                (this.getArtist() != null ? " - " + this.getArtist() : "") +
                (this.getLength() > 0 ? " - " + this.getLength() : "") +
                ": " + this.getCost() + "$";
    }
    @Override
    public String play() throws PlayerException {
        if(this.getLength() > 0) {
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                }catch(PlayerException e) {
                    throw e;
                }
            }
        }else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
        return null;
    }

}

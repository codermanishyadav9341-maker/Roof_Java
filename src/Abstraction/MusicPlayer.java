package Abstraction;

public interface MusicPlayer {

    void playSong(String name);
    void pause();
}

class SpotifyPlayer implements MusicPlayer{

    @Override
    public void playSong(String name){
        System.out.println("Spotify is on :- " +name);
    }

    @Override
  public void pause(){
        System.out.println("Spotify Paused");
    }

}

class LocalPlayer implements MusicPlayer{

    @Override
    public void playSong(String name){
        System.out.println("LocalPlayer is on " +name);
    }

    @Override
    public void pause(){
        System.out.println("LocalPlayer Paused");
    }

    public static void main(String[] args){
        MusicPlayer p1 = new SpotifyPlayer();
        p1.playSong("PremRatanDhan Payaoo");
        p1.pause();

        MusicPlayer p2 = new LocalPlayer();
        p2.playSong("Lata");
        p2.pause();

    }

}
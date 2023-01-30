public class Song {
    public static void main(String[] args) {
        Songs jackSparrow = new Songs("The Lonely Island", "Jack Sparrow", 196);
        Songs anotherSparrow = new Songs("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}

class Songs{
    private String artist;
    private String name;
    private int durationInSeconds;

    public Songs(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if(this == compared ){
            return true;
        }

        if(!(compared instanceof Songs)){
            return false;
        }

        Songs convertedSong = (Songs) compared;

        if
        (this.artist.equals(convertedSong.artist) &&
                (this.name.equals(convertedSong.name)) &&
                this.durationInSeconds == convertedSong.durationInSeconds){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
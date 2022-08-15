package  head_first_java.src.main.java.classes_and_objects.be_the_compiler;
class StreamingSongTestDrive {
    public static void main(String[] args) {
        StremingSong song = new StremingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
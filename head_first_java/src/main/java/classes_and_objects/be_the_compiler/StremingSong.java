package  head_first_java.src.main.java.classes_and_objects.be_the_compiler;
public class StremingSong {
    String title;
    String artist;
    int duration;
    void play() {
        System.out.println("Playing song");
    }
    void printDetails() {
        System.out.println("This is " + title +
                " by " + artist);
    }
}




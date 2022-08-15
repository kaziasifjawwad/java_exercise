***
Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of these files will compile. If they won’t compile, how would you fix them, and if they do compile, what would be their output?
***
## A

```java
class StreamingSong {
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

class StreamingSongTestDrive {
    public static void main(String[] args) {
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
```
# `solution`
<br>
In the above code, we did not create any instance of StreamingSong class in StreamingSongTestDrive. However, we tried to access 
to artist using dot operation via a song object. However, the object was not created. The solution would be involve with creating object named 
song. Here is the fixd version of the above code.


```java
class StreamingSong {
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

class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
```
Now the output reseult would be like this :<br>
`
Playing song
This is Come Together by The Beatles
`
## B
```java
class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}


class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
}
```
`Solution`<br>
In the above code the Episode class does not have any method named play. So, when I will call it from the EpisodeTestDrive using an object, it will throw a compile time
error.
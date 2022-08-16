package head_first_java.src.main.chapter_05__extra_strength_method.be_the_jvm;

public class fdfd {
}

class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
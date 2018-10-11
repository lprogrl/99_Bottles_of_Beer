public class Lesson1 {

    public static void main(String[] args) {
        int beerNum = 99;
        int cyclecounter = 10;
        int cyclecounteralpha = 1;
        int exception = 0;

        while (beerNum > 0) {
            String word = "бутылок";
            cyclecounter = cyclecounter-1;
            cyclecounteralpha = cyclecounteralpha+1;
            exception = exception+1;
            if (beerNum < 9) {
                if (cyclecounter == 1) {
                    word = "бутылка";
                }
                if (cyclecounter == 2) {
                    word = "бутылки";
                }
                if (cyclecounter == 3) {
                    word = "бутылки";
                }
                if (cyclecounter == 4) {
                    word = "бутылки";
                }
            }
            if (beerNum > 20) {
                if (cyclecounter == 1) {
                    word = "бутылка";
                }
                if (cyclecounter == 2) {
                    word = "бутылки";
                }
                if (cyclecounter == 3) {
                    word = "бутылки";
                }
                if (cyclecounter == 4) {
                    word = "бутылки";
                }
            }
            if (exception == 89) {
                word = "бутылок";
            }
            if (exception == 88) {
                word = "бутылок";
            }
            if (exception == 87) {
                word = "бутылок";
            }
            if (exception == 86) {
                word = "бутылок";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (cyclecounter == 0) {cyclecounter = 10;}
            if (exception > 100) {exception = 1;}
                if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
            }
    }
}

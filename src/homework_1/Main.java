package homework_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cinderella> Cinderellas = new ArrayList<>();
        Cinderellas.add(new Cinderella("Maria", 19, 36));
        Cinderellas.add(new Cinderella("Ira", 25, 37));
        Cinderellas.add(new Cinderella("Sofia", 23, 39));
        Cinderellas.add(new Cinderella("Alina", 18, 35));
        Cinderellas.add(new Cinderella("Angelina", 21, 40));
        Cinderellas.add(new Cinderella("Dasha", 22, 32));
        Cinderellas.add(new Cinderella("Yana", 26, 38));
        Cinderellas.add(new Cinderella("Maria", 35, 41));
        Cinderellas.add(new Cinderella("Nastya", 40, 37));
        Cinderellas.add(new Cinderella("Katya", 24, 38));

        Prince prince = new Prince("Vasya", 25, 37);
        System.out.println(prince);

        for (Cinderella cinderella : Cinderellas) {
            if (prince.getShoeSize()==cinderella.getFootSize()){
                System.out.println(cinderella);
            }
        }
    }
}

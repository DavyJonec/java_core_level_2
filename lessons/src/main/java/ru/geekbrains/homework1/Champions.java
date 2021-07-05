package ru.geekbrains.homework1;

public class Champions {
    public static void main(String[] args) {
        Creatures[] creatures = {
                new Cat("Boris",3000, 2500),
                new Human("Andrew",2800, 4000),
                new Robot("R2D2",1000, 200),
        };

        Barrier[] barriers = {
                new Wall(100),
                new Treadmill(1000),
                new Wall(2500),
                new Treadmill(3000),
                new Wall(4000),
        };

        for (Creatures participant : creatures) {
            for (Barrier traps : barriers) {
                if (!traps.overcome(participant)) break;
            }
        }
    }
}

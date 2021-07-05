package ru.geekbrains.homework1;

public class Treadmill implements Barrier {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Creatures creatures) {
        if (creatures.run(this.length)) {
            System.out.printf("%s %s was able to run of %dm \n", creatures.getClass().getSimpleName(), creatures.getName(), length);
            return true;
        }
        System.out.printf("%s %s wasn't able to run of %dm\n", creatures.getClass().getSimpleName(), creatures.getName(), length);
        return false;
    }
}
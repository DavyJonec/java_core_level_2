package ru.geekbrains.homework1;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Creatures creatures) {
        if (creatures.jump(this.height)) {
            System.out.printf("%s %s jumped over wall of %dm\n", creatures.getClass().getSimpleName(), creatures.getName(), height);
            return true;
        }
        System.out.printf("%s %s haven't jumped over wall of %dm\n", creatures.getClass().getSimpleName(), creatures.getName(), height);
        return false;
    }
}

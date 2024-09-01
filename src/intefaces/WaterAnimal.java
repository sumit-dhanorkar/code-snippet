package intefaces;

interface WaterAnimal {
    public boolean canBreath();
}

interface LandAnimal{
    public boolean canBreath();
}


class Crocodile implements WaterAnimal, LandAnimal{

    @Override
    public boolean canBreath() {
        return false;
    }
}
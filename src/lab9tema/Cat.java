package lab9tema;

public class Cat {
    private int mood=0;
    private int hungry=0;
    private int energy=0;

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    private void meow() {
        System.out.println("Miauna pisica");
       //SoundOfAnimals.soundOfAnimal("cat.mp3");
    }

    public void feed() {
        int h = this.getHungry();
        this.setHungry(--h);
        System.out.println("Cat is that hungry: "+this.getHungry());
        int m=this.getMood();
        this.setMood(++m);
        System.out.println("Cat's mood is that good: "+this.getMood());
        this.meow();
    }

    public void sleep() {
        int e = this.getEnergy();
        this.setEnergy(++e);
        System.out.println("Cat's energy is about: "+this.getEnergy());
        int h = this.getHungry();
        this.setHungry(++h);
        System.out.println("Cat is that hungry: "+this.getHungry());
        this.meow();
    }


    public void play() {
        int m = this.getMood();
        this.setMood(++m);
        System.out.println("Cat's mood is that good: "+this.getMood());
        int e = this.getEnergy();
        this.setEnergy(--e);
        System.out.println("Cat's energy is about: "+this.getEnergy());
        this.meow();
    }

}

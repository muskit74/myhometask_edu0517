/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать
метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать
метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        Horse horse = new Horse("Конь","скаковой");
        System.out.print(horse.getNickname()+" "+horse.getBreed()+": ");
        horse.run();
        Pegasus pegasus = new Pegasus("Пегас","окрыленный");
        System.out.print(pegasus.getNickname()+" "+pegasus.getBreed()+": ");
        pegasus.fly();
    }
}

interface AnimalInterface{
    public void run();
    public void fly();
}

abstract class Animal implements AnimalInterface{
    private String nickname;
    private String breed;
    
    public Animal(String nickname, String breed) {
        this.nickname = nickname;
        this.breed = breed;            }
    public String getNickname() { return nickname; }
    public String getBreed() { return breed; }
    }

class Horse extends Animal{
    public Horse(String nickname, String breed) {
        super(nickname, breed);
    }
    @Override
    public void run() { System.out.println("Игого, я поскакал(а)"); }
    public void fly() { };
}

class Pegasus extends Horse{
    public Pegasus(String nickname, String breed) {
        super(nickname, breed);
    }
    @Override
    public void run() { }
    public void fly() { System.out.println("Игого, я полетел(а)"); };
}

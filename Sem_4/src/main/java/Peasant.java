// Класс, описывающий крестьянина
class Peasant extends BaseHero {
    public Peasant(String name, int health, int speed, int x, int y) {
        super(name, health, speed, x, y);
    }
    public void step() {
        System.out.println(name + " делает шаг!");
    }

    public void farm() {
        System.out.println(name + " занимается фермерством!");
    }
}
// Класс, описывающий снайпера
class Sniper extends BaseHero {
    public Sniper(String name, int health, int speed, int x, int y) {
        super(name, health, speed, x, y);
    }
    public void step() {
        System.out.println(name + " делает шаг!");
    }

    public void farm() {
        System.out.println(name + " стреляет!");
    }
}
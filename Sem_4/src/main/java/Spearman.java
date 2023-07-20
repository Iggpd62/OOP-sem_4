// Класс, описывающий копейщика
class Spearman extends BaseHero {
    public Spearman(String name, int health, int speed, int x, int y) {
        super(name, health, speed, x, y);
    }
    public void step() {
        System.out.println(name + " делает шаг!");
    }

    public void farm() {
        System.out.println(name + " удар копьем!");
    }
}

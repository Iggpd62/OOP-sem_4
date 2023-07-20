import java.util.ArrayList;
import java.util.List;
interface CharacterInterface {
    void step();
    String getInfo();
    Coordinates getCoordinates();
}


public class Main {
    public static void main(String[] args) {
        List<CharacterInterface> heroes1 = new ArrayList<>();
        List<CharacterInterface> heroes2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            heroes1.add(new Peasant("Крестьянин" + (i + 1), 100, 5, i, i));
            heroes2.add(new Rogue("Разбойник" + (i + 1), 150, 10, i, i));
            heroes2.add(new Sniper("Снайпер" + (i + 1), 130, 8, i, i));
            heroes2.add(new Warlock("Колдун" + (i + 1), 80, 6, i, i));
            heroes1.add(new Spearman("Клпейщик" + (i + 1), 150, 7, i, i));
            heroes1.add(new Crossbowman("Арбалетчик" + (i + 1), 120, 8, i, i, 10, heroes1, heroes2));
            heroes1.add(new Monk("Монах" + (i + 1), 90, 5, i, i));
        }

        CharacterInterface closestEnemy = null;
        double closestDistance = Double.MAX_VALUE;

        for (CharacterInterface hero : heroes1) {
            for (CharacterInterface enemy : heroes2) {
                double distance = calculateDistance(hero, enemy);
                if (distance < closestDistance) {
                    closestDistance = distance;
                    closestEnemy = enemy;
                }
            }
        }

        if (closestEnemy != null) {
            System.out.println("Наиболее приближенный противник:");
            System.out.println("Имя: " + closestEnemy.getInfo());
            System.out.println("Расстояние: " + closestDistance);
        }
    }

    public static double calculateDistance(CharacterInterface c1, CharacterInterface c2) {
        int dx = c2.getCoordinates().getX() - c1.getCoordinates().getX();
        int dy = c2.getCoordinates().getY() - c1.getCoordinates().getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
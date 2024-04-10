package CE48;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;

    }

    @Override
    public String toString() {
        return String.format("{name='%s', hitPoints=%d, strength=%d}", name, hitPoints, strength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> fields = new ArrayList<>();
        fields.add(name);
        fields.add(String.valueOf(hitPoints));
        fields.add(String.valueOf(strength));
        return fields;
    }

    @Override
    public void read(List<String> list) {
        if (list != null) {
            if (list.size() >= 1) name = list.get(0);
            if (list.size() >= 2) hitPoints = Integer.parseInt(list.get(1));
            if (list.size() >= 3) strength = Integer.parseInt(list.get(2));
        }
    }
}

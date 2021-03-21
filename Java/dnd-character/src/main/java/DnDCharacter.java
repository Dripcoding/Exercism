import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitPoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitPoints = ability();
    }

    public int ability() {
        List<Integer> scores = new ArrayList();
        for (int i = 0; i < 6; i++) {
            scores.add((int) ((Math.random() * 6) + 1));
        }

        Collections.sort(scores);
        int smallestScore = scores.get(0);
        int score = 0;
        for (int i = scores.size() - 1; i > scores.size() - 4; i--) {
            score += scores.get(i);
        }
        return score - smallestScore;
    }

    public int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}

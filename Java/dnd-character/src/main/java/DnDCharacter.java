import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitPoints = ability();
    }

    int ability() {
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

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}

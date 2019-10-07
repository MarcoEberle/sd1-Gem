import java.util.ArrayList;
import java.util.List;

public class GemBox {

    /**
     * List of Gems.
     */
    List<Gem> box;

    /**
     * Default Constructor
     */
    public GemBox() {
        box = new ArrayList();
    }

    /**
     * Copy-Constructor with another GemBox as argument.
     *
     * @param other - Another GemBox that we copy.
     */
    public GemBox(GemBox other) {
        this.box = other.getBox();
    }

    /**
     * Method to add a special gem with a specific amount to the box.
     *
     * @param gem    - What kind of gem.
     * @param amount - How much gems should be added.
     */
    public void add(Gem gem, int amount) {
        for (int counterGems = 0; counterGems < amount; counterGems++) {
            box.add(gem);
        }
    }

    /**
     * Method to remove a special amount of a specific gem.
     *
     * @param gem    - What kind of gem.
     * @param amount - How much gems should be removed.
     */
    public void remove(Gem gem, int amount) {
        for (int counterGems = 0; counterGems < amount; counterGems++) {
            box.remove(gem);
        }
    }

    /**
     * Method that changes one gem to another.
     *
     * @param from - What gem should be changed.
     * @param to   - Change the from gem to this gem.
     */
    public void alchemy(Gem from, Gem to) {
        for (int indexBox = 0; indexBox < box.size(); indexBox++) {
            if (box.get(indexBox) == from) {
                box.set(indexBox, to);
            }
        }
    }

    /**
     * Method to print the amount of gems visibly by the amount of D,R and E.
     * Example: One Diamond, two Rubies and three Emeralds create a String like "(DRREEE)".
     */
    public void print() {
        String gemDiamond = "";
        String gemRuby = "";
        String gemEmerald = "";


        for (int indexBox = 0; indexBox < box.size(); indexBox++) {
            if (box.get(indexBox) == Gem.Diamond) {
                gemDiamond = gemDiamond.concat("D");
            } else if (box.get(indexBox) == Gem.Emerald) {
                gemEmerald = gemEmerald.concat("E");
            } else {
                gemRuby = gemRuby.concat("R");
            }
        }
        System.out.print("(" + gemDiamond + gemRuby + gemEmerald + ")");
    }

    /**
     * Getter that returns the whole gem box.
     *
     * @return - Returns an ArrayList of the gem box.
     */
    public List<Gem> getBox() {
        return box;
    }

}

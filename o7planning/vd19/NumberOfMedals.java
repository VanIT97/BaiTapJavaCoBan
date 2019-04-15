package o7planning.vd19;

import java.util.Objects;

public class NumberOfMedals {
    private int goldCount;
    private int silverCount;
    private int bronzeCount;

    public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
        this.goldCount = goldCount;
        this.silverCount = silverCount;
        this.bronzeCount = bronzeCount;

    }

    public void setGoldCount(int goldCount) {
        this.goldCount = goldCount;
    }

    public void setSilverCount(int silverCount) {
        this.silverCount = silverCount;
    }

    public void setBronzeCount(int bronzeCount) {
        this.bronzeCount = bronzeCount;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public int getSilverCount() {
        return silverCount;
    }

    public int getBronzeCount() {
        return bronzeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfMedals that = (NumberOfMedals) o;
        return goldCount == that.goldCount &&
                silverCount == that.silverCount &&
                bronzeCount == that.bronzeCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(goldCount, silverCount, bronzeCount);
    }
}

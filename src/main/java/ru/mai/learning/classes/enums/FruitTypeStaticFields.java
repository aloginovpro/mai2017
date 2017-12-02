package ru.mai.learning.classes.enums;

public class FruitTypeStaticFields {

    public static final FruitTypeStaticFields APPLE = new FruitTypeStaticFields(true, true);
    public static final FruitTypeStaticFields LEMON = new FruitTypeStaticFields(false, false);

    public final boolean isSweet;
    public final boolean isRed;

    private FruitTypeStaticFields(boolean isSweet, boolean isRed) {
        this.isSweet = isSweet;
        this.isRed = isRed;
    }

}

package ru.mai.learning.classes.enums;

public enum FruitType {

    APPLE(true, true),
    LEMON(false, false);

    public final boolean isSweet;
    public final boolean isRed;

    FruitType(boolean isSweet, boolean isRed) {
        this.isSweet = isSweet;
        this.isRed = isRed;
    }
}

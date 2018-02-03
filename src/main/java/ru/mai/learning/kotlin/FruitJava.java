package ru.mai.learning.kotlin;

public class FruitJava {

    public final String color;
    public final int weightGr;
    public final String name;

    private FruitJava(String color, int weightGr, String name) {
        this.color = color;
        this.weightGr = weightGr;
        this.name = name;
    }
/*
    public FruitJava(int weightGr, String name) {
        this("red", weightGr, name);
    }
*/
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String color = "red";
        private int weightGr = 100;
        private String name = "apple";

        private Builder() {}

        public FruitJava build() {
            return new FruitJava(color, weightGr, name);
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWeightGr(int weightGr) {
            this.weightGr = weightGr;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    }

}

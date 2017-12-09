package ru.mai.learning.classes.builder;

import javax.annotation.Nullable;

public class Player {

    public final int id;
    public final String name;
    @Nullable
    public final String email;

    private Player(int id, String name, @Nullable String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        @Nullable
        private String name = "noname";
        private String email;

        private Builder() {}

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Player build() {
            return new Player(id, name, email);
        }

    }

}

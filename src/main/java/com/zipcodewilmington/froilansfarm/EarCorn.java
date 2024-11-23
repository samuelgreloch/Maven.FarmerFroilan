package com.zipcodewilmington.froilansfarm;

public class EarCorn implements Edible {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof EarCorn; // Customize equality logic if needed
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Ensure consistency with equals
    }
}

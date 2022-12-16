package com.sda.cristi.advanced.enums.ex1;

public enum Planet {
    MERCUR("Huge", "Mercur", 1241241221),
    VENUS("Huge", "Venus", 3243232),
    TERRA("Huge", "Terra", 23423432),
    JUPITER("Huge", "Jupiter", 23423423),
    SATURN("Huge", "Saturn", 5213214);

    private final String relativeSize;
    private final String displayValue;
    private final long distanceFromTerra;


    Planet(String relativeSize, String displayValue, long distanceFromTerra) {
        this.relativeSize = relativeSize;
        this.displayValue = displayValue;
        this.distanceFromTerra = distanceFromTerra;
    }

    public long getDistanceFromTerra() {
        return distanceFromTerra;
    }

    @Override
    public String toString() {
        return relativeSize + displayValue;
    }
}

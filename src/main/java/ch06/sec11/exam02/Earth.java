package ch06.sec11.exam02;

public class Earth {

    static final double RADIUS = 6400;

    static final double SURFACE_AREA;

    static {
        SURFACE_AREA = 4 * Math.PI * RADIUS * RADIUS;
    }
}

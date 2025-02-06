package com.csc205.project1;


/*

    In Java,

    generate unit tests for Class Point, including edge cases

 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testConstructorAndGetters() {
        Point p = new Point(3.0, 4.0);
        assertEquals(3.0, p.getX());
        assertEquals(4.0, p.getY());
    }

    @Test
    public void testSetters() {
        Point p = new Point(0.0, 0.0);
        p.setX(5.0);
        p.setY(6.0);
        assertEquals(5.0, p.getX());
        assertEquals(6.0, p.getY());
    }

    @Test
    public void testSetPoint() {
        Point p = new Point(0.0, 0.0);
        p.setPoint(7.0, 8.0);
        assertEquals(7.0, p.getX());
        assertEquals(8.0, p.getY());
    }

    @Test
    public void testShiftX() {
        Point p = new Point(1.0, 1.0);
        p.shiftX(3.0);
        assertEquals(4.0, p.getX());
    }

    @Test
    public void testShiftY() {
        Point p = new Point(1.0, 1.0);
        p.shiftY(3.0);
        assertEquals(4.0, p.getY());
    }

    @Test
    public void testDistance() {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);
        assertEquals(5.0, p1.distance(p2), 0.0001);
    }

    @Test
    public void testRotate() {
        Point p = new Point(1.0, 0.0);
        p.rotate(Math.PI / 2); // Rotate by 90 degrees
        assertEquals(0.0, p.getX(), 0.0001);
        assertEquals(1.0, p.getY(), 0.0001);
    }

    @Test
    public void testRotate360Degrees() {
        Point p = new Point(1.0, 0.0);
        p.rotate(2 * Math.PI); // Rotate by 360 degrees
        assertEquals(1.0, p.getX(), 0.0001);
        assertEquals(0.0, p.getY(), 0.0001);
    }

    @Test
    public void testToString() {
        Point p = new Point(9.0, 10.0);
        assertEquals("Point(x=9.0, y=10.0)", p.toString());
    }
}

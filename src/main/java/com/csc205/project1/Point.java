package com.csc205.project1;


/*

    In Java,

    Design & implement a class called Point that represents a location in the Cartesian plane.
    Include (at a minimum) the following methods:

    A constructor that takes x and y coordinates as double arguments
    setX(double x), setY(double y) - standard setters
    getX(), getY() - standard getters
    setPoint(double x, double y) - set the coordinates of the point.
    shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
    distance(Point p2) - finds the distance to point p2.
    rotate(double angle) - rotates the point by a specified (radian) angle around the origin.
    Include a toString method as well.

 */


public class Point {

    private double x;
    private double y;

    // Constructor that takes x and y coordinates as double arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Standard setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Standard getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift a point by a given amount along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift a point by a given amount along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Finds the distance to point p2
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }

    // Rotates the point by a specified (radian) angle around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // Returns a string representation of the point
    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }

    public static void main(String[] args) {
        // Example usage
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Initial coordinates of p1: " + p1);
        System.out.println("Initial coordinates of p2: " + p2);

        p1.shiftX(2);
        p1.shiftY(3);

        System.out.println("Coordinates of p1 after shifting: " + p1);

        double distance = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + distance);

        p1.rotate(Math.PI / 4); // Rotate p1 by 45 degrees
        System.out.println("Coordinates of p1 after rotation: " + p1);
    }

}

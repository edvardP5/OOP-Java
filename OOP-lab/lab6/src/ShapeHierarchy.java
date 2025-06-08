abstract class Shape {
    double volume;
    abstract double getVolume();
}

abstract class SolidOfRevolution extends Shape {
    double radius;

    SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
        volume = Math.PI * radius * radius * height;
        return volume;
    }
}

class Ball extends SolidOfRevolution {
    Ball(double radius) {
        super(radius);
    }

    double getVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}

class Pyramid extends Shape {
    double s;
    double h;

    Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    double getVolume() {
        volume = (s * h) / 3;
        return volume;
    }
}

public class pol {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.height = 15;
        t.length = 12;
        t.width = 14;
        t.calculateArea();
    }
}

class Shape {
    double length, height, width;

}

class Reactangle extends Shape {
    void calculateArea() {
        double Area = length * width;
        System.out.println("The area of Ract is :" + Area);
    }

}

class Triangle extends Reactangle {
    void calculateArea() {
        super.calculateArea();
        double Area = (length * height * width) / 2;
        System.out.println("The area of Triangle is :" + Area);
    }
}

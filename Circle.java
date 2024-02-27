    public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius * 100) / 100.0;
    }

    public double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100) / 100.0;
     }

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printCharacteristics() {
        System.out.println("Круг:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}

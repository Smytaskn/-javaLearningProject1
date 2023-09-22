class Pen {
    public void drawRectangle(Rectangle r) {
        int area;
        area = r.calculateArea();
        System.out.println("Dikdörtgenin Alanı: " + area);
    }

    public void drawCircle(Circle c) {
        double area = c.calculateArea();
        System.out.println("Çemberin Alanı: " + area);
    }

    public void changeColorRectangle(String color, Rectangle r) {
        r.setColor(color);
        System.out.println("Dikdörtgenin Rengi Değiştirildi: " + color);
    }

    public void changeColorCircle(String color, Circle c) {
        c.setColor(color);
        System.out.println("Çemberin Rengi Değiştirildi: " + color);
    }
}

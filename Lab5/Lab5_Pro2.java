public class Lab5_Pro2 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.print("Perimeter : " + regularPolygon1.getPerimeter());
        System.out.println(" \tArea : " + regularPolygon1.getArea());

        System.out.print("Perimeter : " + regularPolygon2.getPerimeter());
        System.out.println("\tArea : " + regularPolygon2.getArea());

        System.out.print("Perimeter : " + regularPolygon3.getPerimeter());
        System.out.println("\tArea : " + regularPolygon3.getArea());
    }
}

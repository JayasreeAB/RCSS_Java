import java.util.Scanner;
interface Operation {
    double area(double radius, double height);
    double volume(double radius, double height);
}
class Cylinder implements Operation {
    
    public double area(double radius, double height) {
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return area;
    }
    public double volume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
}
class area_vol{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = s.nextDouble();
        System.out.println("Enter height:");
        double height = s.nextDouble();
        Operation obj = new Cylinder();

        double calculatedArea = obj.area(radius, height);
        double calculatedVolume = obj.volume(radius, height);

        System.out.println("\n--- Cylinder Results ---");
        System.out.println("Radius: "+ radius);
        System.out.println("Height:"+ height);
        System.out.println("Area = "+ calculatedArea);
        System.out.println("Volume ="+ calculatedVolume);
    }
} 



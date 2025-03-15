class Box {
      // Attributes (Fields)
      double length, width, height;
  
      // Constructor to initialize the box's dimensions
      Box(){
          length = 1;
          width = 1;
          height = 1;
      }
      Box(double l, double w){
          length = l;
          width = w;
          height = 1;
      }
      Box(double l, double w, double h) {
          length = l;
          width = w;
          height = h;
      }
  
      // Method to calculate the volume of the box
      double calculateVolume() {
          return length * width * height;
      }
      double calculateSA() {
          return 2*( length * width + length * height + width * height);
      }
  
      // Method to display box dimensions and volume
      void displayOwtalls() {
          System.out.println("Box Dimensions: " + length + " x " + width + " x " + height);
          System.out.println("Box Surface Area:" + calculateSA());
          System.out.println("Volume: " + calculateVolume());
      }
  }
  
  public class ConstructorOL {
      public static void main(String[] args) {
          // Create two Box objects with different dimensions
          Box box1 = new Box(5.0, 3.0, 2.0);  // First box with length 5.0, width 3.0, and height 2.0
          Box box2 = new Box(7.0, 4.0, 3.0);  // Second box with length 7.0, width 4.0, and height 3.0
          Box box3 = new Box();
          Box box4 = new Box(3,4);  
  
          // Display information for both boxes
          System.out.println("Box 1:");
          box1.displayOwtalls();  // Display details for box1
  
          System.out.println("\nBox 2:");
          box2.displayOwtalls();  // Display details for box2
 
          System.out.println("Box 3:");
          box3.displayOwtalls();
 
          System.out.println("Box 4:");
          box4.displayOwtalls();
      }
  }

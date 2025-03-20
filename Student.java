class Student {
    // Attributes
    private String name;
    private int rollNum;
    private String address;
    private double totalMarks;
    private int standard; // Represents the current standard/year of the student

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.rollNum = 0;
        this.address = "Not specified";
        this.totalMarks = 0.0;
        this.standard = 1; // Assuming default standard is 1
    }

    // Parameterized constructor
    public Student(String name, int rollNum, String address, double totalMarks, int standard) {
        this.name = name;
        this.rollNum = rollNum;
        this.address = address;
        this.totalMarks = totalMarks;
        this.standard = standard;
    }

    // Method to display student information
    public void displayInfo() {

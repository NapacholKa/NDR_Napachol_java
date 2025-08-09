public class Student {
    private String name;
    private String address;
    private int numCourse = 0;

    private String[] course = new String[30];
    private int[] grades = new int[30];

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.address + ")";
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourse < 30) {
            this.course[numCourse] = course;
            this.grades[numCourse] = grade;
            numCourse++;
        } else {
            System.out.println("Cannot add more than 30 courses");
        }
    }

    public void printGrades() {
        System.out.println(this.name + "'s grades:");
        for (int i = 0; i < numCourse; i++) {
            System.out.print(course[i] + ": " + grades[i]);
            if(i < numCourse -1 ){System.out.println();}
        }
   
    }
    public double getAverageGrade(){
        if (numCourse == 0) return 0.0;
        int sum = 0;
        for(int i=0 ;i<numCourse ; i++){
            sum += grades[i];
        }
        return (double)sum/numCourse;
    }
}

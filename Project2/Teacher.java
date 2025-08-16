public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses = new String[5];

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // course already exists
            }
        }
        if (numCourses < 5) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        } else {
            System.out.println("Cannot add more courses, limit reached.");
            return false;
        }
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // shift left
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j+1];
                }
                numCourses--;
                return true;
            }
        }
        return false; // course not found
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}

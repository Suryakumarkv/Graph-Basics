public class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return this.name;
    }
}


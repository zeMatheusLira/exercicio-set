package newexercise02.entities;

import java.util.Objects;

public class Teacher {
    private int students;

    public Teacher(int a) {
        students = a;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return students == teacher.students;
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}

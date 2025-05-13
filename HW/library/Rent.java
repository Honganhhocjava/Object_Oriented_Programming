package hus.oop.library;

import com.oop.collections.phonebook.Student;

import java.util.Date;

public class Rent {
    private Item item;
    private Date end,begin;
    private Student student;

    public Rent(Item item, Date end, Date begin, Student student) {
        this.item = item;
        this.end = end;
        this.begin = begin;
        this.student = student;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Rent[" +
                "item=" + item +
                ", end=" + end +
                ", begin=" + begin +
                ", student=" + student +
                ']';
    }

    public Student getStudent() {
        return student;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getEnd() {
        return end;
    }

    public Date getBegin() {
        return begin;
    }
}

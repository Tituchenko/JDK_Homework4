package org.example;
//Номер телефона
//        Имя
//        Стаж
public class Student {
    private long phone;
    private String name;
    private int experience;

    private int number;

    public Student(long phone, String name, int experience,int number) {
        this.phone = phone;
        this.name = name;
        this.experience = experience;
        this.number=number;
    }

    public long getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
    public String toStringPhone() {
        return  "Телефон=" + phone;
    }
    @Override
    public String toString() {
        return  "Имя="+name +
                ", Телефон=" + phone +
                ", Стаж=" + experience+
                ", Табельный номер=" + number;
    }
}

package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник
//        должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник
public class StudentDirectory {
    int currentNumber;
    private Map<Integer,Student> students=new HashMap<>();
    public void add(long phone, String name, int experience){
        students.put(currentNumber,new Student(phone, name,experience,currentNumber++));
    }

    public Map<Integer,Student> findByExperience(Integer experience){
        Map<Integer,Student> result = new HashMap<>();
        for (Map.Entry<Integer, Student> entry: students.entrySet()) {
            if (entry.getValue().getExperience()==experience) result.put(entry.getKey(),entry.getValue());
        }
        return result;
    }
    public Map<Integer,Student> findByName(String name){
        Map<Integer,Student> result = new HashMap<>();
        for (Map.Entry<Integer, Student> entry: students.entrySet()) {
            if (entry.getValue().getName().equals(name)) result.put(entry.getKey(),entry.getValue());
        }
        return result;
    }

    public Student findByNumber(int number){
        return students.get(number);
    }
    public String printList(Map <Integer, Student> list,Boolean onlyPhone){
        String studentString="";
        for (Map.Entry<Integer, Student> entry: list.entrySet()) {
            if (onlyPhone) studentString+=entry.getValue().toStringPhone()+"\n";
                else studentString+=entry.getValue().toString()+"\n";
        }

        return "Список студенотов:\n" +
                studentString;
    }
    public String printList(Map <Integer, Student> list){
       return printList(list,false);
    }

    @Override
    public String toString() {
        return printList(students);
    }
}

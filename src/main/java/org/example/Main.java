package org.example;

public class Main {
    public static void main(String[] args) {
        StudentDirectory tabel=new StudentDirectory();
        tabel.add(89267871094L,"Иванов И.И.",3);
        tabel.add(89267871095L,"Петров И.И.",4);
        tabel.add(89267871096L,"Иванов И.И.",5);
        tabel.add(89267871097L,"Иванов И.И.",6);
        tabel.add(89267871088L,"Сидоров И.И.",3);
        tabel.add(89267871078L,"Пупкин И.И.",3);
        tabel.add(89267871897L,"Машков И.И.",1);
        tabel.add(89267871078L,"Васечуин И.И.",0);
        tabel.add(89267871543L,"Гри И.И.",2);
        tabel.add(89267871123L,"Джо И.И.",2);
        System.out.println(tabel);
        System.out.println("Поиск по табельному номеру 5: "+tabel.findByNumber(5));

        System.out.println("Поиск по опыту 3: "+tabel.printList(tabel.findByExperience(3)));

        System.out.println("Поиск по имени Иванов И.И.: "+tabel.printList(tabel.findByName("Иванов И.И."),true));


    }
}
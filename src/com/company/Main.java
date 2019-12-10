package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       // Animal chihuahua = new Chihuahua();
       // chihuahua.run();
        List<Person> people = Arrays.asList(
                new Person("Adam",18,"M"),
                new Person("Ewa",16,"K"),
                new Person("Ala",21,"K"),
                new Person("Adam",29,"M"),
                new Person("Adam",11,"M"),
                new Person("Ola",15,"K"),
                new Person("Adam",22,"M")
        );

                            people
                                .stream()
                                .filter(Person.menPredicate.and(Person.personUnder18Predicate))
                                .collect(Collectors.toList())
                                .forEach(System.out::println);

/*
        for (String[][] tab1: getTable()) {
            for (String [] tab2 : tab1) {
                for (String elem : tab2) {
                  //  System.out.println(elem);
                }
            }
        }
        String [][][]tab = getTable();

        for (int i=0; i<tab.length; i++){
            for (int j=0; j<tab[i].length; j++){
                for (int k=0; k<tab[i][j].length; k++){
                    System.out.println(tab[i][j][k]);
                }
            }
        }
*/
    }
    public static String[][][] getTable(){
        return  new String[][][]{
                {{"A1"},{"A2"}},
                {{"B1"},{"B2"}},
                {{"C1"},{"C2"}}
        };
    }

}
class Person{

    String name;
    Integer age;
    String sex;

    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public static Predicate<Person> personUnder18Predicate = person -> person.getAge()<18;
    public static Predicate<Person> menPredicate = person -> person.sex.equals("M");
}


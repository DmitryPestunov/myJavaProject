package school;

import school.lesson8.*;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args){

        ArrayList <String> list = new ArrayList<>();

        list.add("Hello");
        list.add("hello");
        list.add("Hi");
        list.add("Bye");
        list.add("bye");
        list.add("What");
        list.add("you");
        list.add("do");
        list.add("Do");
        list.add("You");
        list.add("what");
        list.add("List");
        list.add("phone");
        list.add("car");
        list.add("airplane");
        list.add("world");

        FindAndShowUniqueWord fasuw = new FindAndShowUniqueWord();
        fasuw.findAndShow(list);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(5152553, "Pestunov");
        phoneBook.add(5555555, "Borysenko");
        phoneBook.add(2223344, "Pestunov");

        phoneBook.get("Pestunov");
        phoneBook.get("Ivanov");

    }

}
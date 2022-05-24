package school;

import school.lesson3.Employee;

public class Runner {
    public static void main(String[] args) {

        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Ivan Ivanov", "junior", "ivanovi@gmail.com",
                                    56545852, 1000, 21);
        emplArray[1] = new Employee("Petr Petrov", "junior", "petrovp@gmail.com",
                                    65681594, 1200, 22);
        emplArray[2] = new Employee("Denis Lutsenko", "middle", "lutsenkod@gmail.com",
                                    54815656, 2000, 40);
        emplArray[3] = new Employee("Vitali Borisenko", "senior", "borisenkov@gmail.com",
                                    56545852, 3000, 41);
        emplArray[4] = new Employee("Andrey Trugaaa", "Master Yoda", "masterY@gmail.com",
                                    11111111, 10000, 25);

        for(int i = 0; i<emplArray.length; i++){
            if(emplArray[i].getAge()>40){
                System.out.println(emplArray[i]);
            }
        }
    }
}

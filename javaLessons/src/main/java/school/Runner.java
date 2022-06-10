package school;

import school.lesson7.AppData;
import java.io.*;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args){

        File file = new File("data.csv");

        AppData app = new AppData();

        app.read(file);
        System.out.println(Arrays.deepToString(app.getHeader()));
        System.out.println(Arrays.deepToString(app.getData()));

        String[] heater = {"Value10","Value20","Value30","Value40","Value50"};
        int [][] data = {{1,1,1},{2,2,2},{3,2,3}};
        app.setHeader(heater);
        app.setData(data);
        app.write(file);
        System.out.println(Arrays.deepToString(app.getHeader()));
        System.out.println(Arrays.deepToString(app.getData()));

    }

}

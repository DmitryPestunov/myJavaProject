package school.lesson7;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data = new int[10][10];

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void read(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            header  = reader.readLine().split(";");
            String line;
            int a = 0;
            while ((line = reader.readLine()) != null){
                String[] values = line.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[a][i] = Integer.parseInt(values[i]);
                }
                a++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write (File file){
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(file))) {
            for (String value : header) {
                writter.write(value + ";");
            }
            writter.newLine();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    writter.write(data[i][j]+";");
                }
                writter.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

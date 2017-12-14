package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    private static final long serialVersionUID = 1L;

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String fileName = "2014.txt";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

        Solution savedSolution = new Solution(65);
        out.writeObject(savedSolution);
        out.flush();
        out.close();

        File file = new File(fileName);
        if(!file.exists() || file.length() == 0) {
            System.out.println("Object not saved");
        }

        Solution loadedSolution = (Solution)in.readObject();
        if(!savedSolution.string.equals(loadedSolution.string)) {
            System.out.println("Objects not equals");
        }
    }
}

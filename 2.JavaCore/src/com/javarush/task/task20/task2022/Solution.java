package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        // out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
        // in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Solution solution = new Solution("D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\task2022.txt");
        solution.writeObject("task2022\r\n");

        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\task2022.a.txt"));
        oos.writeObject(solution);

        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\task2022.a.txt")));
        Solution solution2 = (Solution) ois.readObject();
        solution2.writeObject("task2022 - task2022");
    }
}

package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable {
    private static final long serialVersionUID = 1L;

    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, does not matter
        System.out.println("test - " + this.getClass() + " - " + Thread.currentThread().getName());
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException {
        /* String fileName = "D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2015\\2015.txt";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

        Solution savedSolution = new Solution(55);
        out.writeObject(savedSolution);
        out.flush();
        out.close();

        File file = new File(fileName);
        if(!file.exists() || file.length() == 0) {
            System.out.println("Object not saved");
        }

        Solution loadedSolution = (Solution)in.readObject();
        Thread.sleep(1000); */
    }
}

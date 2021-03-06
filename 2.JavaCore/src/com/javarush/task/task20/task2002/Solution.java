package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            user.setBirthDate(new GregorianCalendar(1980, 11, 25).getTime());
            user.setCountry(User.Country.RUSSIA);
            user.setMale(true);

            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            // try (DataOutputStream out = new DataOutputStream(outputStream)) {
            DataOutputStream out = new DataOutputStream(outputStream);
                out.writeInt(users.size());
                for (User user : users) {
                    String firstName = (user.getFirstName() == null) ? "null" : user.getFirstName();
                    out.writeUTF(firstName);
                    String lastName = (user.getLastName() == null) ? "null" : user.getLastName();
                    out.writeUTF(lastName);
                    out.writeLong(user.getBirthDate().getTime());
                    out.writeBoolean(user.isMale());
                    out.writeUTF(user.getCountry().name());
                }
            // }
            out.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            // try (DataInputStream fromFile = new DataInputStream(inputStream)) {
            DataInputStream fromFile = new DataInputStream(inputStream);
                int count = fromFile.readInt();
                for (int i = 0; i < count; i++) {
                    User user = new User();

                    String firstName = fromFile.readUTF();
                    if (firstName.equals("null")) firstName = null;
                    user.setFirstName(firstName);
                    String lastName = fromFile.readUTF();
                    if (lastName.equals("null")) lastName = null;
                    user.setLastName(lastName);
                    user.setBirthDate(new Date(fromFile.readLong()));
                    user.setMale(fromFile.readBoolean());
                    user.setCountry(User.Country.valueOf(fromFile.readUTF()));

                    users.add(user);
                }
            // }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

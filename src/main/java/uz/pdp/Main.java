package uz.pdp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(22);
        student.setName("Abdulloh");
        student.setId(1);
        System.out.println(student);
        System.out.println(student.getName());
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String toJson = gson.toJson(student);
        System.out.println(toJson);

        String jsonStudent="[" +
                "{" +
                "\"id\":3," +
                "\"name\":\"S3\"," +
                "\"yosh\":18" +
                "}," +
                "{" +
                "\"id\":4," +
                "\"name\":\"S4\"," +
                "\"yosh\":28" +
                "}" +
                "]";
        Student[] studentArr = gson.fromJson(jsonStudent, Student[].class);
        System.out.println(Arrays.toString(studentArr));
    }
}

package com.example.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Text;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
        show =findViewById(R.id.show);
        String json = "[\n" +
                "    {\n" +
                "      \"age\": 50,\n" +
                "      \"role\": \"father\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 49,\n" +
                "      \"role\": \"mother\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 22,\n" +
                "      \"role\": \"son\"\n" +
                "    }\n" +
                "  ]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json,familyType);
//        String json  = "{\n" +
//                "  \"address\": {\n" +
//                "    \"city\": \"Indore\",\n" +
//                "    \"country\": \"India\"\n" +
//                "  },\n" +
//                "  \"age\": 22,\n" +
//                "  \"family\": [\n" +
//                "    {\n" +
//                "      \"age\": 50,\n" +
//                "      \"role\": \"father\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"age\": 49,\n" +
//                "      \"role\": \"mother\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"age\": 22,\n" +
//                "      \"role\": \"son\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"first_Name\": \"Aman Holkar\",\n" +
//                "  \"mail\": \"amanholkar00@gmail.com\"\n" +
//                "}";
//
//        Employee employee = gson.fromJson(json,Employee.class);
//        show.setText(employee.getmFamily().get(2).getmRole());
//        Address address = new Address("India","Indore");
//        List<FamilyMember> family = new ArrayList<>();
//        family.add(new FamilyMember("father",50));
//        family.add(new FamilyMember("mother",49));
//        family.add(new FamilyMember("son",22));
//        Employee employee = new Employee("Aman Holkar",22,"amanholkar00@gmail.com",address,family);
//
//        String json = gson.toJson(employee);

//        Employee employee = new Employee("Aman ",22,"amanholkar00@gmail.com");
//        String json = gson.toJson(employee);

//        String json ="{\n" + "  \"age\": 22,\n" + "  \"first_Name\": \"Aman \",\n" + "  \"mail\": \"amanholkar00@gmail.com\"\n" + "}";
//         Employee employee = gson.fromJson(json,Employee.class);

//        String json ="{\n" + "  \"address\": {\n" + "    \"city\": \"Indore\",\n" + "    \"country\": \"India\"\n" + "  },\n" + "  \"age\": 22,\n" + "  \"first_Name\": \"Aman Holkar\",\n" + "  \"mail\": \"amanholkar00@gmail.com\"\n" + "}";
//        Employee employee = gson.fromJson(json,Employee.class);
//        show.setText(employee.getmAddress().getmCity());
    }
}

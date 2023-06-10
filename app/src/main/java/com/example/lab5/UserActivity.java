package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    ArrayList<information> infomationlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        RecyclerView rvUser =findViewById(R.id.rvUser);
        infomationlist = new ArrayList<>();
        infomationlist.add(new information(R.drawable.bia,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","android"));
        infomationlist.add(new information(R.drawable.bunbo,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","IOS"));
        infomationlist.add(new information(R.drawable.pho,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","nokia"));
        infomationlist.add(new information(R.drawable.miquang,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","windors"));
        infomationlist.add(new information(R.drawable.nuocmia,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","linux"));
        infomationlist.add(new information(R.drawable.coca,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","php"));
        infomationlist.add(new information(R.drawable.hutieu,"Version 2 of the course is available as of September 2018. The course has been updated to reflect best practices for more recent versions of the Android framework and Android Studio. The original Android Developer Fundamentals (V1) course concepts and practicals are still available, if you need to refer to those files.","macOX"));

        UserAdapter adapter = new UserAdapter(infomationlist);
        rvUser.setAdapter(adapter);
        rvUser.setLayoutManager(new LinearLayoutManager(this));
    }
}
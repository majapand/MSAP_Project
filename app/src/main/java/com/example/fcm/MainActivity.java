package com.example.fcm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    private EditText mTitle, mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = findViewById(R.id.mTitle);
        mMessage = findViewById(R.id.mMessage);

        findViewById(R.id.mSend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = mTitle.getText().toString().trim();
                String message = mMessage.getText().toString().trim();
                if(!title.equals("")&& !message.equals("")){
                    FCMSend.pushNotification(
                            com.example.fcm.MainActivity.this,
                            "cHSzarFLQT2R0rrHvpYAtG:APA91bHsrG6uP4QW1VTH0g0XEcpw2tQCrW5vkCZksKKpMoVwUiqCN_RvrIYbfkOd3UUolNg-GnwTq_6mA8lsYBJxWl-i5_WBqWSPRDYcUgNK0U-eAhDJadCJdeO0pst0HjkHwgXWcde_",
                            "Hello",
                            "Hello World Message"
                    );
                }

            }
        });


    }
}
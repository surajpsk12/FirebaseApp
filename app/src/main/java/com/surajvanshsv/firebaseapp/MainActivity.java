package com.surajvanshsv.firebaseapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        // Write a message to the database

        // Initialize and Access the Firebase Database
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        // Get a reference to a specific node in the database
        DatabaseReference myRef = database.getReference("Users");

        User user1 = new User("Vansh","vansh123@gmail.com");
        myRef.setValue(user1);
//        myRef.setValue("Hii i am vansh ");
//

        TextView txt = findViewById(R.id.textview1);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                String newValue = snapshot.getValue(String.class);
                    User user2 = snapshot.getValue(User.class);
                    txt.setText("email:"+user2.getEmial());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
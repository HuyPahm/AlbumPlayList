//package ntu.proj.fixingthingsocop;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//import androidx.recyclerview.widget.DividerItemDecoration;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.google.firebase.ktx.Firebase;
//
//import java.util.ArrayList;
//import java.util.List;
//
////public class MainActivity extends AppCompatActivity {
////
////    List<Testing> lstOCOP;
////
////    RVadapter adapter;
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        EdgeToEdge.enable(this);
////        setContentView(R.layout.activity_main);
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
////            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
////            return insets;
////        });
////
////        //kết nối csdl
////        FirebaseDatabase database = FirebaseDatabase.getInstance();
////        DatabaseReference databaseReference = database.getReference("Test");
////        //lang81 nghe
////        lstOCOP = new ArrayList<Testing>();
////
////        databaseReference.addValueEventListener(ngheFB);
////
////
////        //dieu khien
////
////        RecyclerView recyclerView = findViewById(R.id.rcv);
////        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
////        recyclerView.setLayoutManager(linearLayoutManager);
////        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
////        adapter = new RVadapter(lstOCOP);
////        recyclerView.setAdapter(adapter);
////        adapter.notifyDataSetChanged();
////
////    }
////    ValueEventListener ngheFB = new ValueEventListener() {
////        @Override
////        public void onDataChange(@NonNull DataSnapshot snapshot) {
////            // lấy dữ liệu từ biến snapshot, đưa vào một biến danh sách để xử lý
////            for(DataSnapshot obj: snapshot.getChildren()){
////                Testing testing = obj.getValue(Testing.class);
////                lstOCOP.add(testing);
//////                    Log.w("Test", "007"+ testing.ID());
//////                    Log.w("te")
////            }
////            adapter.notifyDataSetChanged();
////
////        }
////
////        @Override
////        public void onCancelled(@NonNull DatabaseError error) {
////
////        }
////    };
////}
//
//public class MainActivity extends AppCompatActivity {
//
//    private EditText input,input2,input3,input4,input5,input6,input7,input8,input9,input10,input11;
//    private Button btn;
//
//    private Button btnRead;
//    private TextView textView,textView2;
//
//    private DatabaseReference rootDatabaseref;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//        // Write a message to the database
////        FirebaseDatabase database = FirebaseDatabase.getInstance();
////        rootDatabaseref = database.getReference().child("huycc");
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference databaseReference = database.getReference("Task");
//
//        input=findViewById(R.id.input);
//        input2=findViewById(R.id.input2);
//        input3=findViewById(R.id.input3);
//        input4=findViewById(R.id.input4);
//        input5=findViewById(R.id.input5);
//        input6=findViewById(R.id.input6);
//        input7=findViewById(R.id.input7);
//        input8=findViewById(R.id.input8);
//        input9=findViewById(R.id.input9);
//        input10=findViewById(R.id.input10);
//        input11=findViewById(R.id.input11);
//        btn=findViewById(R.id.btn);
//        btnRead=findViewById(R.id.btnRead);
//        textView=findViewById(R.id.textView);
//
////        rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("huycc");
////
////        btnRead.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                rootDatabaseref.addValueEventListener(new ValueEventListener() {
////                    @Override
////                    public void onDataChange(@NonNull DataSnapshot snapshot) {
////
////                    }
////
////                    @Override
////                    public void onCancelled(@NonNull DatabaseError error) {
////
////                    }
////                })
////            }
////        });
//
//        btnRead.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rootDatabaseref.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        if (snapshot.exists())
//                        {
//                            String data = snapshot.getValue().toString();
//                            textView.setText(data);
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
//            }
//        });
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String data=input.getText().toString();
//                rootDatabaseref.setValue(data);
//            }
//        });
//
//
//
//
//    }
//}


package ntu.proj.fixingthingsocop;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private EditText input, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11;
    private Button btn, btnRead;
    private TextView textView;
    private DatabaseReference rootDatabaseref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handle edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize Firebase database reference
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        rootDatabaseref = database.getReference().child("Task");

        // Initialize UI elements
        input = findViewById(R.id.input);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);
        input9 = findViewById(R.id.input9);
        input10 = findViewById(R.id.input10);
        input11 = findViewById(R.id.input11);
        btn = findViewById(R.id.btn);
        btnRead = findViewById(R.id.btnRead);
        textView = findViewById(R.id.textView);

        // Set read button click listener
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootDatabaseref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data = snapshot.getValue().toString();
                            textView.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Log.e("MainActivity", "Failed to read data.", error.toException());
                    }
                });
            }
        });

        // Set write button click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = input.getText().toString();
                String data2 = input2.getText().toString();
                String data3 = input3.getText().toString();
                String data4 = input4.getText().toString();
                String data5 = input5.getText().toString();
                String data6 = input6.getText().toString();
                String data7 = input7.getText().toString();
                String data8 = input8.getText().toString();
                String data9 = input9.getText().toString();
                String data10 = input10.getText().toString();
                String data11 = input11.getText().toString();

                Task task = new Task(data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11);

                rootDatabaseref.setValue(task);
            }
        });
    }
}

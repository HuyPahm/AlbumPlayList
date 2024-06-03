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


import android.content.Intent;
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
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText inputID, inputHuyen, inputTenSP, inputPhanLoai, inputTenChuSX, inputLoaiHinh, inputDiaChi, inputTenDD, inputSDT, inputSHS, inputNamCN;
    private Button btn, btnRead;
    private TextView textView;
    private DatabaseReference rootDatabaseref;
    private List<Task> taskList = new ArrayList<>();
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        rootDatabaseref = database.getReference().child("Task");

        inputID = findViewById(R.id.input_ID);
        inputHuyen = findViewById(R.id.input_Huyen);
        inputTenSP = findViewById(R.id.input_TenSP);
        inputPhanLoai = findViewById(R.id.input_PhanLoai);
        inputTenChuSX = findViewById(R.id.input_TenChuSX);
        inputLoaiHinh = findViewById(R.id.input_LoaiHinh);
        inputDiaChi = findViewById(R.id.input_DiaChi);
        inputTenDD = findViewById(R.id.input_TenDD);
        inputSDT = findViewById(R.id.input_SDT);
        inputSHS = findViewById(R.id.input_SHS);
        inputNamCN = findViewById(R.id.input_NamCN);
        btn = findViewById(R.id.btn);
        btnRead = findViewById(R.id.btnRead);
        textView = findViewById(R.id.textView);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        taskAdapter = new TaskAdapter(taskList);
        recyclerView.setAdapter(taskAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDataToFirebase();
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readDataFromFirebase();
            }
        });
    }

    private void addDataToFirebase() {
        final String ID = inputID.getText().toString();
        final String Huyen = inputHuyen.getText().toString();
        final String TenSP = inputTenSP.getText().toString();
        final String PhanLoai = inputPhanLoai.getText().toString();
        final String TenChuSX = inputTenChuSX.getText().toString();
        final String LoaiHinh = inputLoaiHinh.getText().toString();
        final String DiaChi = inputDiaChi.getText().toString();
        final String TenDD = inputTenDD.getText().toString();
        final String SDT = inputSDT.getText().toString();
        final String SHS = inputSHS.getText().toString();
        final String NamCN = inputNamCN.getText().toString();

        rootDatabaseref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                long childCount = snapshot.getChildrenCount();
                String childName = String.format("%02d", childCount + 1);
                DatabaseReference childRef = rootDatabaseref.child(childName);

                Task task = new Task(ID, Huyen, TenSP, PhanLoai, TenChuSX, LoaiHinh, DiaChi, TenDD, SDT, SHS, NamCN);
                childRef.setValue(task);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("MainActivity", "Failed to add data.", error.toException());
            }
        });
    }

    private void readDataFromFirebase() {
        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                taskList.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Task task = dataSnapshot.getValue(Task.class);
                    taskList.add(task);
                }
                taskAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("MainActivity", "Failed to read data.", error.toException());
            }
        });
    }
    public void editTask(View view) {
        // Lấy ID của task từ view
        String taskID = ((TextView) view.getRootView().findViewById(R.id.task_item_ID)).getText().toString();

        // Gửi ID đến màn hình chỉnh sửa task
        Intent intent = new Intent(MainActivity.this, EditText.class);
        intent.putExtra("taskID", taskID);
        startActivity(intent);
    }

    public void deleteTask(View view) {
        // Lấy ID của task từ view
        String taskID = ((TextView) view.getRootView().findViewById(R.id.task_item_ID)).getText().toString();

        // Xoá task từ Firebase
        DatabaseReference taskRef = rootDatabaseref.child(taskID);
        taskRef.removeValue();
    }
}

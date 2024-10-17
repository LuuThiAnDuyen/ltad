package com.example.example_21;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edttaiKhoan, edtpass, edtTB;
    Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edttaiKhoan = findViewById(R.id.edttaiKhoan);
        edtpass = findViewById(R.id.edtpass);
        edtTB = findViewById(R.id.edtTB);
        btnDangNhap = findViewById(R.id.btnDangNhap);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edttaiKhoan.getText().toString().equals("FIT") && edtpass.getText().toString().equals("123")){
                    edtTB.setText("Đăng nhập thành công");
                }
                else {
                    edtTB.setText("Đăng nhập thất bại");
                }
            }
        });


    }
}
package sdu.cs58.kritsada.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1.Explicit ประกาศตัวแปร
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString,userString,passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2.Initail view ผูกตัวแปร Java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);
        //3.สั่งให้ปุ่มตอบสนองเมื่อ user คลิกปุ่ม (event)
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ดึงข้อมูลที่userป้อนในหน้าuiมาเก็บในตัวแปร ชนิดstring

                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                //ตรวจสอบการlogin
                if ((userString.equals("admin"))&&(passwordString.equals("1234"))){
                    Toast.makeText(getApplicationContext(), "Login success!! " , Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Login fail!! " , Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(getApplicationContext(), "Hallo!! Hello!! " + nameString + " G G", Toast.LENGTH_SHORT).show();
            }
        }); //end onClicklistener

    }  //end method onCreate
} //end class

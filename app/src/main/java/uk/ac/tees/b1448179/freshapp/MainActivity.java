package uk.ac.tees.b1448179.freshapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view){
        TextView txtHello = findViewById(R.id.txtMessage); //r stands for resources -- find view searches for the res id name you want to
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        txtHello.setText("Welcome "+ edtTxtName.getText().toString()); //changes the text of our text view to hi

    }

}
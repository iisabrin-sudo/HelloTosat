package com.example.counter;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private int count =0;
public static ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void addToast(View view){
        Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT).show();
    }
    public void cleear(View view){
        count=0;
mainBinding.textView.setText(String.valueOf(count));
        mainBinding.button2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#808080")));

}

    public void showCount(View view){
count++;
mainBinding.button2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF9800")));
//mainBinding.textView.setText(count+"");
        mainBinding.textView.setText(String.valueOf(count));
    }
}
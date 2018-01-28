package net.iot.somaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGoButtonClicked(View v){
        Toast.makeText(this, "두번째 액티비티로 들어가기", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }
}

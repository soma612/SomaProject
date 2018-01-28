package net.iot.somaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView system_Message;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        system_Message = (TextView)findViewById(R.id.sys_message);
        iv = (ImageView)findViewById(R.id.reclerview_item_imageview);

        RecyclerView view = (RecyclerView)findViewById(R.id.main_recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,8);
        view.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        view.setAdapter(myRecyclerViewAdapter);
    }
    public void onGoButtonClicked(View v){
        Toast.makeText(this, "두번째 액티비티로 들어가기", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }
    public void onBlockClicked(View v){
        system_Message.setText("System Message : 블록이 클릭되었습니다.");

    }
}

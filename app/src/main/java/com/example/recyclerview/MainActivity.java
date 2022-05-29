package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private ArrayList<Post>posts;
    private int[] postImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }
    private void initView(){
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false));
        postAdapter=new PostAdapter(posts);
        recyclerView.setAdapter(postAdapter);
    }
    private void initData(){
        postImg=new int[]{R.drawable.elephant,R.drawable.flower,R.drawable.flower1,
                R.drawable.planet2,R.drawable.lion,R.drawable.planet4};
        posts=new ArrayList<Post>();

        for (int i=1;i<postImg.length;i++){

          posts.add(new Post(i,"post"+i,postImg[i],0));
        }
    }
}
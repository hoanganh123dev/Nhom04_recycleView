package com.example.nhom04_recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class MainActivity extends AppCompatActivity {
    private List<MonHoc> lstMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvMonHoc = (RecyclerView) findViewById(R.id.rcvMonHoc);
        MonHocAdapter adapter = new MonHocAdapter(MonHoc.LayDSMonHoc());
        rvMonHoc.setAdapter(adapter);
        rvMonHoc.setHasFixedSize(true);
        rvMonHoc.scrollToPosition(2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        layoutManager.scrollToPosition(1);
        rvMonHoc.setLayoutManager(layoutManager);
        rvMonHoc.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL);
        rvMonHoc.addItemDecoration(itemDecoration);
        rvMonHoc.setItemAnimator(new SlideInUpAnimator());
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lstMonHoc.add(0, new MonHoc("didong", "ZZZ", "XXX","YYY"));
                adapter.notifyItemInserted(0);
            }
        });

        rvMonHoc.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }
            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }

}
package com.bwie.dell.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bwie.dell.buttonknifer.BindView;
import com.bwie.dell.buttonknifer.ButtonKnfe;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonKnfe.Bind(this);
        textView.setText("闫阔个Σ(☉▽☉");

//        //注册eventbus
//        EventBus.getDefault().register(this);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().postSticky(new Person("闫阔","女","21"));
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //取消注册
//        EventBus.getDefault().unregister(this);
//    }

//    @Subscribe(threadMode = ThreadMode.POSTING)
//    public void Person(Person person){
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        Log.d("TAG", "Thread==: "+Thread.currentThread().getName()+" "+person.toString());
//    }

}

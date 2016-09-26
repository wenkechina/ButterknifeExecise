package wenke.makelove.butterknifeexecise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
* 第一步： setting---plugins 中搜寻 butterknife zelezny 这个插件  安装后重启
*
* 第二步：github上下载 butterknife 包导入，https://github.com/JakeWharton/butterknife
*
         或者 compile 'com.jakewharton:butterknife:8.4.0'
  第三步：
* */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button1, R.id.button2, R.id.button3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "我是Activity的点击事件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this,ButterKnifeInViewHolder.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this,ButterKnifeInFragment.class));
                break;
        }
    }

}

package demo.android.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_enter)
    TextView tv_enter;
    /*    @BindView(R.id.et_enter)
        EditText et_enter;*/
    @BindView(R.id.btn_enter)
    Button btn_enter;
    @BindView(R.id.rv_display)
    RecyclerView rv_dis;
    @BindString(R.string.item1)
    String items;

    ArrayList<String> disstringlist;
    AdapterDis adapterDis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        disstringlist = new ArrayList<>();

        disstringlist.add(items);

    }

    @OnClick(R.id.btn_enter)
    public void setBtn_enter(View view) {
        adapterDis = new AdapterDis(this, disstringlist);
        rv_dis.setAdapter(adapterDis);
        rv_dis.setLayoutManager(new LinearLayoutManager(this));
    }
}

package com.bonc.fragmenttabhost;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private TextView title;
    public List<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadioGroup = (RadioGroup) findViewById(R.id.tabs_rg);
        title = (TextView) findViewById(R.id.tv_title);
        //初始化Title
        title.setText(R.string.FragmentA);
        fragments.add(new TabAFm());
        fragments.add(new TabBFm());
        fragments.add(new TabCFm());
        fragments.add(new TabDFm());
        fragments.add(new TabEFm());

        FragmentTabAdapter tabAdapter = new FragmentTabAdapter(this, fragments, R.id.tab_content, mRadioGroup);
        tabAdapter.setOnRgsExtraCheckedChangedListener(new FragmentTabAdapter.OnRgsExtraCheckedChangedListener(){
            @Override
            public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {
                //根据索引位置设置标题
                switch (index){
                    case 0:
                        title.setText(R.string.FragmentA);
                        break;
                    case 1:
                        title.setText(R.string.FragmentB);
                        break;
                    case 2:
                        title.setText(R.string.FragmentC);
                        break;
                    case 3:
                        title.setText(R.string.FragmentD);
                        break;
                    case 4:
                        title.setText(R.string.FragmentE);
                        break;
                }
            }
        });
    }
}

package com.bonc.fragmenttabhost;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class TabBFm extends Fragment {
    private TextView textView;
    private MainActivity activity;
    private EditText editText;
//    private Message msg;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        System.out.println("BBBBBBBBBBB____onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("BBBBBBBBBBB____onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("BBBBBBBBBBB____onCreateView");
        return inflater.inflate(R.layout.tab_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("BBBBBBBBBBB____onActivityCreated");
        // 获得绑定的FragmentActivity
        activity = ((MainActivity) getActivity());
        // 获得TabAFm的控件
        editText = (EditText) activity.fragments.get(0).getView().findViewById(R.id.edit);
        // 获得自己布局中的控件
        textView = (TextView) getView().findViewById(R.id.tv_textview);
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("BBBBBBBBBBB____onStart");
    }

    /**
     * 切换回本身Fragment时执行     onResume
     * 屏幕解锁时执行               onStart      onResume
     * 回到应用时                   onStart      onResume
     */
    @Override
    public void onResume() {
        super.onResume();
        //实时获取Tab1中EditText中的输入的内容
        textView.setText(editText.getText());
        System.out.println("BBBBBBBBBBB____onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("BBBBBBBBBBB____onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("BBBBBBBBBBB____onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("BBBBBBBBBBB____onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("BBBBBBBBBBB____onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("BBBBBBBBBBB____onDetach");
    }


}

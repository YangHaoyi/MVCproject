package com.yhy.mvcproject.view;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yhy.mvcproject.R;
import com.yhy.mvcproject.controler.EventBusDataBean;
import com.yhy.mvcproject.controler.LoginEvent;
import com.yhy.mvcproject.model.LoginModel;

import de.greenrobot.event.EventBus;

/**
 * 作者 : YangHaoyi on 2016/7/19.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener, TextWatcher {

    private LoginModel loginModel;
    private EditText phoneNumber;
    private Button login;
    private long exitTime = 0;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginModel = new LoginModel(this);
        EventBus.getDefault().register(this);
        init();
    }
    private void init(){
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        login       = (Button)   findViewById(R.id.login);
        login.setOnClickListener(this);
        login.setClickable(false);
        login.setAlpha(.4f);
        phoneNumber.addTextChangedListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                loginModel.requestData();
                break;
        }
    }
    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }
    public void onEvent(EventBusDataBean eventBusDataBean){
        if(eventBusDataBean instanceof LoginEvent){
            LoginEvent loginEvent = (LoginEvent) eventBusDataBean;
            if(loginEvent.isLoginSuccess()){
                Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(LoginActivity.this,"网络连接异常",Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if(TextUtils.isEmpty(s)){
            login.setClickable(false);
            login.setAlpha(0.4f);
        }else {
            login.setClickable(true);
            login.setAlpha(1f);
        }
    }
    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis()-exitTime>2000){
            Toast.makeText(LoginActivity.this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        }else {
            super.onBackPressed();
        }
    }
}

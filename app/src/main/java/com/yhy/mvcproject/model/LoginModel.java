package com.yhy.mvcproject.model;

import android.content.Context;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.yhy.mvcproject.controler.LoginEvent;
import com.yhy.mvcproject.net.ActionConst;
import com.yhy.mvcproject.response.Register;
import com.yhy.mvcproject.response.ResponseDataBean;

import org.apache.http.Header;

import de.greenrobot.event.EventBus;

/**
 * 作者 : YangHaoyi on 2016/7/19.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class LoginModel extends BaseModel {

    private LoginEvent loginEvent;

    public LoginModel(Context context) {
        super(context);
        loginEvent = new LoginEvent();
    }

    public void requestData(){
        String url;
        url = String.format("");
        System.out.println("Test url is "+url);
        client.get2(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
                String rawData = new String(arg2);
                Gson gson = new Gson();
                Register result = gson.fromJson(rawData,Register.class);
                if(result!=null&&result.getCodeMsg()== ResponseDataBean.CODE.SUCCESS){
                    loginEvent.setLoginSuccess(true);
                    EventBus.getDefault().post(loginEvent);
                }
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                loginEvent.setLoginSuccess(false);
                EventBus.getDefault().post(loginEvent);
            }
        });
    }
}

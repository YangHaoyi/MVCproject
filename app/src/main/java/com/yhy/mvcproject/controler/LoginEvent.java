package com.yhy.mvcproject.controler;

/**
 * 作者 : YangHaoyi on 2016/7/19.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class LoginEvent extends EventBusDataBean{

    private boolean loginSuccess;

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }
}

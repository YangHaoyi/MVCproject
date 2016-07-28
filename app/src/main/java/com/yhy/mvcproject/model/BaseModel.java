package com.yhy.mvcproject.model;

import android.content.Context;

import com.yhy.mvcproject.net.KoraRestClient;

/**
 * 作者 : YangHaoyi on 2016/7/19.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class BaseModel {
    protected KoraRestClient client;
    protected Context context;
    public BaseModel(Context context) {
        this.context = context;
        client = KoraRestClient.getInstance(context.getApplicationContext());
    }
}

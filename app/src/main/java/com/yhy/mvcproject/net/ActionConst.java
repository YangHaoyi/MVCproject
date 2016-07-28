package com.yhy.mvcproject.net;

public class ActionConst {
	public static String appTest = "http://app-test.evershare.cn";//appTest为可编辑地址变量
	public static String httpserver = appTest + ":8080";//测试环境

	public static String httpserverIp=httpserver+"/rental-app";

	public static String mgTest = "http://app-test.evershare.cn"+":9999";//mgTest为微服务可编辑地址变量

	public static String HTTP_USER_SERVER     = mgTest + "/hkr-mod-na";//终端用户+运营用户

}

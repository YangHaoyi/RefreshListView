package com.yhy.refreshlistview.network;

public class ActionConst {
	public static final String ACTION_RESPONSE = "android.intent.action.MYNET_RESPONSE";

	public static String appTest = "http://app-test.evershare.cn"+ Constants.V1_FORMAL_PORT;//appTest为可编辑地址变量
	public static String httpserver = appTest;

	public static String httpserverIp=httpserver+"/rental-app";

	public static String mgTest = "http://app-test.evershare.cn"+ Constants.V2_FORMAL_PORT;//mgTest为微服务可编辑地址变量
	public static String HTTP_MICSERVER       = mgTest + "/hkr-mod-cu";//优惠+活动+发票+违章

	public static String HTTP_MIC_ORDERSERVER;//废弃

	public static String HTTP_CXN             = mgTest + "/hkr-agg-he";//租车服务+优惠+计价

	public static String HTTP_MIC_WXSERVER    = mgTest + "/hkr-agg-si";//支付服务

	public static String HTTP_USER_SERVER     = mgTest + "/hkr-mod-na";//终端用户+运营用户

	public static String HTTP_AD_SERVER       = mgTest + "/hkr-mod-cu";//优惠+活动+发票+违章+告警

	public static String HTTP_VEHICLE_SERVER       = mgTest + "/hkr-mod-fe";//租赁车辆+私家车

	public static String HTTP_CODE_TIME      = mgTest + "/hkr-agg-ar";//免密登录验证码

	public static String HTTP_AU          = mgTest + "/hkr-mod-au";//自助缴费

	public static String HTTP_STOP_CHARGE = mgTest+"/hkr-agg-ne"; //充电

	public static String HTTP_FEEDBACK = mgTest+"/hkr-mod-tl";//反馈+用户协议+静态基础数据

	public static String HTTP_BRANCH_PILE = mgTest+"/hkr-mod-mn";  //网点电桩
}

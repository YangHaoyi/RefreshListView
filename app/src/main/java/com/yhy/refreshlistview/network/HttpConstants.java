package com.yhy.refreshlistview.network;

/**
 * 作者 : YangHaoyi on 2016/8/3.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class HttpConstants {
    public static final String V1 = "/api/v1";
    public static final String RENTAL_SHOP = "/rentalshops";
    public static final String PAGE_SIZE = "?pageSize=%s&currentPage=%s";
    public static final String PERATE_FLAG ="?perate_flag=%s";
    public static final String CONNECT = "&";
    public static final String CANCEL_ORDER = "/charging_orders/%s/cancel";
    public static final String CHARGE_COMMAND = "/piles/%s/command";
    public static final String CHARGE_LIVING = "/charging_orders/%s/living";
    public static final String LOOPING_ORDER = "/orders/phone_no=%s";
    public static final String ORDER_CHARGE_LIST = "/charging_orders?&status=%s&pageSize=%s&currentPage=%s";
    public static final String ORDER_CHARGE_HISTORY = "/charging_orders/%s";
    //网点筛选
    public static final String INTERFACE_NORMAL = "&interface_normal=%s";
    public static final String PARTNER_ID = "&partner_id=%s";
    public static final String AVAILABLE_PILE = "&available_pile=%s";

    public static final String PILE_INTERFACE = "/api/v1/pile_interface";
    public static final String PARTNER = "/api/v1/partner";

    public static final String QUESTION_MAKER = "?";

    public static final String SESSION_KEY_INTEFACE_PARAM = "PileInterfaceParam";
    public static final String SESSION_KEY_OPERATOR_PARAM = "PartnerOperatorParam";
    public static final String SESSION_KEY_SHOWFREE_PARAM = "ShowFreeParam";


}

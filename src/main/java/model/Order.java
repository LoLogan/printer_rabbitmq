package model;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by logan on 2017/4/7.
 */
public final class Order {
    private int indexError;     // 头部错误的地方 0-图片头 1-文字头 2-二维码头

    private int textNum = 1;    // 文字要重复多少次

    private boolean hasError;   // 是否有封装错误

    private int bulkId;         // 批次id

    private int bulkIndex;      // 批次内序号

    private long sendTime;      // 订单发送时间

    private long acceptTime;     // 订单接收成功时间

    private long enterQueueTime; // 订单进入打印队列时间

    private long startPrintTime; // 订单开始打印时间

    private long printResultTime;// 订单打印结果时间;

    private long execSendTime;  //  错误订单重传时间;

    private long execAcceptTime;//  错误订单接收时间

    private long execEnterQueueTime;    // 错误订单进入打印队列时间

    private long execStartPrintTime;    // 错误订单开始打印时间

    private long execPrintResultTime;   // 错误订单打印结果时间

    public long getExecSendTime() {
        return execSendTime;
    }

    public void setExecSendTime(long execSendTime) {
        this.execSendTime = execSendTime;
    }

    public long getExecAcceptTime() {
        return execAcceptTime;
    }

    public void setExecAcceptTime(long execAcceptTime) {
        this.execAcceptTime = execAcceptTime;
    }

    public long getExecEnterQueueTime() {
        return execEnterQueueTime;
    }

    public void setExecEnterQueueTime(long execEnterQueueTime) {
        this.execEnterQueueTime = execEnterQueueTime;
    }

    public long getExecStartPrintTime() {
        return execStartPrintTime;
    }

    public void setExecStartPrintTime(long execStartPrintTime) {
        this.execStartPrintTime = execStartPrintTime;
    }

    public long getExecPrintResultTime() {
        return execPrintResultTime;
    }

    public void setExecPrintResultTime(long execPrintResultTime) {
        this.execPrintResultTime = execPrintResultTime;
    }

    public int getBulkId() {
        return bulkId;
    }

    public void setBulkId(int bulkId) {
        this.bulkId = bulkId;
    }

    public int getBulkIndex() {
        return bulkIndex;
    }

    public void setBulkIndex(int bulkIndex) {
        this.bulkIndex = bulkIndex;
    }

    public long getSendTime() {
        return sendTime;
    }

    public void setSendTime(long sendTime) {
        this.sendTime = sendTime;
    }

    public long getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(long acceptTime) {
        this.acceptTime = acceptTime;
    }

    public long getEnterQueueTime() {
        return enterQueueTime;
    }

    public void setEnterQueueTime(long enterQueueTime) {
        this.enterQueueTime = enterQueueTime;
    }

    public long getStartPrintTime() {
        return startPrintTime;
    }

    public void setStartPrintTime(long startPrintTime) {
        this.startPrintTime = startPrintTime;
    }

    public long getPrintResultTime() {
        return printResultTime;
    }

    public void setPrintResultTime(long printResultTime) {
        this.printResultTime = printResultTime;
    }

    public int getTextNum() {
        return textNum;
    }

    public void setTextNum(int textNum) {
        this.textNum = textNum;
    }

    public int getIndexError() {
        return indexError;
    }

    public void setIndexError(int indexError) {
        this.indexError = indexError;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    //　时间格式器
    private static SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm");



    private int mpu;                    //主控板id
    private List<Item> items;           //订单物品

    private byte[] data;                // 数据字节内容
    private boolean isConvert = false;  // 是否已经经过转化

    private Integer id;

    private Date orderTime;

    private String orderRemark;

    private Integer orderMealFee;

    private String orderPayStatus;

    private Integer orderDisFee;

    private Integer orderPreAmount;

    private Integer orderSum;

    private String orderStatus;

    private String userName;

    private String userAddress;

    private String userTelephone;

    private String orderContent;

    private String company;

    private String expectTime;

    private String clientName;

    private String clientAddress;

    private String clientTelephone;

    private boolean hasCompute = false;	//是否已计算总价

    private char orderType;  // 0-非加急; 1-加急

    private int userId;

    public Order() {
        this.orderType = '0';
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setOrderType(char orderType) {
        this.orderType = orderType;
    }

    public char getOrderType() {
        return orderType;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setExpectTime(String expectTime) {
        this.expectTime = expectTime;
    }

    public void setMpu(int mpu) {
        this.mpu = mpu;
    }

    public String getExpectTime() {
        return expectTime;
    }

    public void setConvert(boolean convert) {
        isConvert = convert;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getCompany() {
        return company;
    }

    public int getMpu() {
        return mpu;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Integer getOrderMealFee() {
        return orderMealFee;
    }

    public void setOrderMealFee(Integer orderMealFee) {
        this.orderMealFee = orderMealFee;
    }

    public String getOrderPayStatus() {
        return orderPayStatus;
    }

    public void setOrderPayStatus(String orderPayStatus) {
        this.orderPayStatus = orderPayStatus == null ? null : orderPayStatus.trim();
    }

    public Integer getOrderDisFee() {
        return orderDisFee;
    }

    public void setOrderDisFee(Integer orderDisFee) {
        this.orderDisFee = orderDisFee;
    }

    public Integer getOrderPreAmount() {
        return orderPreAmount;
    }

    public void setOrderPreAmount(Integer orderPreAmount) {
        this.orderPreAmount = orderPreAmount;
    }

    public Integer getOrderSum() {
        if(!hasCompute){
            orderSum = getTotalCost();
            hasCompute = true;
        }

        return orderSum;
    }

    public void setOrderSum(Integer orderSum) {
        this.orderSum = orderSum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }


    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public byte[] getData() {
        if(!isConvert){

        }
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    private int getTotalCost() {
        int c = 0;
        if(items != null) {
            for(Item item : items) {
                c += item.getCost();
            }
        }

        c += orderDisFee;
        c += orderMealFee;
        c -= orderPreAmount;
        c -= getOrderPreAmount();

        return c;
    }



    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n");
        buffer.append("       美团外卖       " + "\n");
        buffer.append("---------------------------\n");
        buffer.append("       " + getClientName() + "       \n");
        buffer.append("---------------------------\n");
        buffer.append("订单编号： " + getId() + "\n");
        buffer.append("下单时间： " + format.format(getOrderTime()) + "\n");
        buffer.append("预计下单时间： " + getExpectTime() + "\n");
        buffer.append("备注： " + getOrderRemark() + "\n");
        buffer.append("---------------------------\n");
        buffer.append("   菜单名     数量     小计\n");
        if(items != null) {
            for(Item item : items){
                buffer.append(item.toString() + "\n");
            }
        }
        buffer.append("---------------------------\n");
        buffer.append("               餐盒费:   " + getOrderMealFee() + "\n");
        buffer.append("               配送费:   " + getOrderDisFee() + "\n");
        buffer.append("               优惠额:   " + getOrderPreAmount() + "\n");
        buffer.append("               合 计:   " + getOrderSum() + "\n");
        buffer.append("                  " + orderPayStatus + "\n");
        buffer.append("---------------------------\n");
        buffer.append("顾客姓名: " + getUserName() + "\n");
        buffer.append("送餐地址: " + getUserAddress() + "\n");
        buffer.append("电话: " + getUserTelephone() + "\n");
        buffer.append("---------------------------\n");
        buffer.append("商家地址: " + getClientAddress() + "\n");
        buffer.append("联系方式: " + getClientTelephone() + "\n");
        return buffer.toString();

    }






}
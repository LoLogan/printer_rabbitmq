package util;

import model.Item;
import model.Order;
import model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by logan on 2017/4/7.
 */
public class OrderBuilder {

    //private static List<User> users = null;
    static User user = new User("林寒戈","工一312","15676898986");

    //private static int userCount = 10;

    public OrderBuilder() {

    }



    private static int num = 0;

    //公司名称
    private static String[] companys = {"美团外卖", "饿了吗", "百度淘米", "百度外卖"};

//	//商家信息
//	private static String shops[] = {"麦当劳", "肯德基", "好难吃的地方", "想不出什么地方了"};
//	private static String address[] = {"gogo新天地一楼25号","广大商业区", "广东工业大学饭堂", "地址未知" };
//	private static String contact[] = {"85241523", "84523651", "15521232546", "15622365842"};

    //菜单
    private static String dish[] = {"西红柿炒番茄", "葡萄干炒木耳", "西瓜干炒香蕉", "榴莲鸡蛋蛋糕", "最好吃童子鸡"};
    private static int prices[] = {4, 4, 5, 3, 8};

    //顾客信息
    private static String customers[] = {"陈俊铭", "温天信", "张诗婷", "李伟淙", "许艺茂", "方锐"};
    private static String cAddress[] = {"广工西三736", "广工西四612", "广工东十三xxx", "广工西三741", "广工西三747", "广工西三2xx"};
    private static String cContact[] = {"15521256251", "18852423652", "13432252452", "15622365455", "18819255400", "15695542562"};

    private static String remarks[] = {"加饭", "晚点来", "加菜"};

    private static String expectTimes[] = {"10:30", "11.30", "12.30", "5.30", "6.30", "7.30"};

    /**
     * 订单生成器 flag 0-非加急； 1-加急
     * @param flag
     * @return
     */
    public static Order produceOrder(boolean flag, boolean hasError)  {
        Order order = new Order();
        order.setHasError(hasError);

        int randomNum = 0;

        //生活公司信息
        randomNum = getRandom(4);
        order.setCompany(companys[randomNum]);

        //生成商家信息
//		randomNum = getRandom(4);


            User u = user;
            order.setClientName(u.getUserStore());
            order.setClientAddress(u.getUserAddress());
            order.setClientTelephone(u.getUserPhone());
            order.setOrderStatus(String.valueOf((byte)0x0A));


        //获取订单信息
        order.setId(12345);

        order.setOrderTime((new Date()));
        order.setExpectTime(expectTimes[getRandom(6)]);
        order.setOrderRemark(remarks[getRandom(3)]);

        //生成顾客信息
        randomNum = getRandom(6);
        order.setUserName(customers[randomNum]);
        order.setUserAddress(cAddress[randomNum]);
        order.setUserTelephone(cContact[randomNum]);
        order.setOrderStatus(Integer.valueOf((byte)0x0A).toString());

        //生成菜
        randomNum = getRandom(5) + 1;
        List<Item> items = new ArrayList<Item>(randomNum);
        for(int i = 0; i < randomNum; i++){
            items.add(createItem(i));
        }
        order.setItems(items);

        //生成其他付费信息
        order.setOrderMealFee(getMealCost());
        order.setOrderDisFee(getdeliveryCost());
        order.setOrderPreAmount(getRandom(6));
        order.setOrderPayStatus("已支付");

        // 判断是否设置加急
        if (flag) {
            order.setOrderType('1');
        } else {
            order.setOrderType('0');
        }
        return order;
    }

    public static Order produceOrder(boolean flag, boolean hasError, int index)  {
        Order order = new Order();
        order.setHasError(hasError);
        order.setIndexError(index);

        int randomNum = 0;

        //生活公司信息
        randomNum = getRandom(4);
        order.setCompany(companys[randomNum]);

        //生成商家信息
//		randomNum = getRandom(4);


            User u = user;
            order.setClientName(u.getUserStore());
            order.setClientAddress(u.getUserAddress());
            order.setClientTelephone(u.getUserPhone());
            order.setOrderStatus(String.valueOf((byte)0x0A));


        //获取订单信息
        order.setId(12356);

        order.setOrderTime((new Date()));
        order.setExpectTime(expectTimes[getRandom(6)]);
        order.setOrderRemark(remarks[getRandom(3)]);

        //生成顾客信息
        randomNum = getRandom(6);
        order.setUserName(customers[randomNum]);
        order.setUserAddress(cAddress[randomNum]);
        order.setUserTelephone(cContact[randomNum]);
        order.setOrderStatus(Integer.valueOf((byte)0x0A).toString());

        //生成菜
        randomNum = getRandom(5) + 1;
        List<Item> items = new ArrayList<Item>(randomNum);
        for(int i = 0; i < randomNum; i++){
            items.add(createItem(i));
        }
        order.setItems(items);

        //生成其他付费信息
        order.setOrderMealFee(getMealCost());
        order.setOrderDisFee(getdeliveryCost());
        order.setOrderPreAmount(getRandom(6));
        order.setOrderPayStatus("已支付");

        // 判断是否设置加急
        if (flag) {
            order.setOrderType('1');
        } else {
            order.setOrderType('0');
        }
        return order;
    }

    public static Order produceOrder(boolean flag, boolean hasError, int index, int textNum)  {
        Order order = new Order();
        order.setTextNum(textNum);
        order.setHasError(hasError);
        order.setIndexError(index);

        int randomNum = 0;

        //生活公司信息
        randomNum = getRandom(4);
        order.setCompany(companys[randomNum]);

        //生成商家信息
//		randomNum = getRandom(4);


            User u = user;
            order.setClientName(u.getUserStore());
            order.setClientAddress(u.getUserAddress());
            order.setClientTelephone(u.getUserPhone());
            order.setOrderStatus(String.valueOf((byte)0x0A));


        //获取订单信息
        order.setId(123456);

        order.setOrderTime((new Date()));
        order.setExpectTime(expectTimes[getRandom(6)]);
        order.setOrderRemark(remarks[getRandom(3)]);

        //生成顾客信息
        randomNum = getRandom(6);
        order.setUserName(customers[randomNum]);
        order.setUserAddress(cAddress[randomNum]);
        order.setUserTelephone(cContact[randomNum]);
        order.setOrderStatus(Integer.valueOf((byte)0x0A).toString());

        //生成菜
        randomNum = getRandom(5) + 1;
        List<Item> items = new ArrayList<Item>(randomNum);
        for(int i = 0; i < randomNum; i++){
            items.add(createItem(i));
        }
        order.setItems(items);

        //生成其他付费信息
        order.setOrderMealFee(getMealCost());
        order.setOrderDisFee(getdeliveryCost());
        order.setOrderPreAmount(getRandom(6));
        order.setOrderPayStatus("已支付");

        // 判断是否设置加急
        if (flag) {
            order.setOrderType('1');
        } else {
            order.setOrderType('0');
        }
        return order;
    }

    private static int getMealCost() {
        return getRandom(3);
    }

    private static int getdeliveryCost() {
        return getRandom(6);
    }

    private static int getOrderNum() {
        return  ++num;
    }

    private static Item createItem(int i){
        Item item = new Item();
        item.setName(dish[i]);
        item.setPrice(prices[i]);
        item.setCount(getRandom(5) + 1);
        return item;
    }

    private static String createRemark() {
        return remarks[getRandom(3)];
    }

    private static int getRandom(int seed) {
        return (int)(Math.random() * seed);
    }
}

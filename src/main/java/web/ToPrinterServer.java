package web;

import com.google.gson.Gson;

import model.Order;
import model.User;
import util.OrderBuilder;


/**
 * Created by logan on 2017/4/7.
 */
public class ToPrinterServer {

    public  String getOrder() {
        Gson gson = new Gson();
        Order order = OrderBuilder.produceOrder(true,false);
        String s = gson.toJson(order);
        return s;
    }

}

package com.ryx.designpattern.controller;

import com.google.gson.Gson;
import com.ryx.designpattern.service.OrderService;
import com.ryx.designpattern.service.dto.OrderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.AssertTrue;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "订单服务", description = "订单服务")
public class OrderController {
    @Autowired
    protected OrderService orderService;

    @GetMapping("/order/{type}")
    @ApiOperation("处理订单--策略模式")
    public String handlerOrder(@PathVariable String type) {
        OrderDTO dto = new OrderDTO();
        dto.setType(Integer.valueOf(type));

        return orderService.handleC(dto);
    }


    public static void main(String[] args) {
        Gson gson = new Gson();
        String a ="[{\n" +
                "\t\"uuid\": \"11\",\n" +
                "\t\"service_code\": \"1\"\n" +
                "}, {\n" +
                "\t\"uuid\": \"11\",\n" +
                "\t\"service_code\": \"1\"\n" +
              "}]";
        /*
        Type type = new TypeToken<<List<NoticeMessage>>>() {}.getType();

        ArrayList<NoticeMessage> arrayList = gson.fromJson(a, ArrayList.class);



        for (NoticeMessage noticeMessage:arrayList){
            System.out.println(noticeMessage);
        }
*/


        Assert.isNull(null,"1");

    }
}

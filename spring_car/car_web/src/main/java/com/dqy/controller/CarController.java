package com.dqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.dqy.api.Car;
import com.dqy.util.DataRespon;
import com.dqy.util.Result;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:19
 * @Version 1.0
 **/
@Controller
@RequestMapping("carController")
public class CarController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("carSelect")
    public String userSelect(){
        return "car";
    }

//    @ApiImplicitParam( paramType = "path") // query代表?后面拼接的参数@RequestParam(代码中接收注解      //@ApiImplicitParams()代表多个
    @RequestMapping(value = "getCar" , method = RequestMethod.POST)
    @ResponseBody
    public Result findOrder(){//body-->请求参数的获取：@RequestBody(代码中接收注解)
        Result forObject = restTemplate.getForObject("http://localhost:8080/serviceController/", Result.class);        //fastjson转换
        Object data = forObject.getData();
        List<Car> list = JSONObject.parseObject(JSONObject.toJSONString(data), List.class);
        System.out.println("查询------------------");
        return  Result.response(DataRespon.SUSSESS).setData(list);

    }

    @ApiOperation(value = "添加订单")
    @ApiImplicitParam(name = "order", value = "订单实体", required = true, paramType = "body",
            dataTypeClass = Car.class)
    @PostMapping
    public Result addOrder(@RequestBody Car car) {
        Result forObject = restTemplate.postForObject("http://localhost:8080/serviceController/",car, Result.class);        //fastjson转换
        Object data = forObject.getData();
        Car car1 = JSONObject.parseObject(JSONObject.toJSONString(data), Car.class);
        return Result.response(DataRespon.SUSSESS).setData(car1);
    }
}

package com.dqy.controller;

import com.dqy.api.Car;
import com.dqy.dao.CarService;
import com.dqy.dao.UsersRepository;
import com.dqy.util.DataRespon;
import com.dqy.util.Result;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:41
 * @Version 1.0
 **/
@RestController
@RequestMapping("serviceController")
public class ServiceController {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private CarService carService;

    @ApiImplicitParam( paramType = "path") // query代表?后面拼接的参数@RequestParam(代码中接收注解      //@ApiImplicitParams()代表多个
//    @ApiOperation(value = "根据id查询数据") //文档api的说明  定义方法名称        //	header-->请求参数的获取：@RequestHeader(代码中接收注解)
    @RequestMapping(method = RequestMethod.GET)//根据id查询  // path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
    public Result findOrder(){                //body-->请求参数的获取：@RequestBody(代码中接收注解)
//        Pageable pageable= PageRequest.of(pageNum,pageSize);
//        Page<Car> page=usersRepository.findAll(pageable);
//        System.out.println("数据的总条数："+page.getTotalElements());
//        System.out.println("总页数："+page.getTotalPages());
//        List<Car> list=page.getContent();//第二页所的所有数据
        List<Car> list = usersRepository.findAll();
        return  Result.response(DataRespon.SUSSESS).setData(list);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)//根据id删除
    public Result delete(@PathVariable("id") Integer id){
        System.out.println("删除-------------");
        return new Result(200,"成功");

    }
//    @RequestMapping(method = RequestMethod.POST)//增加
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "order" ,value = "订单实体类" , required = true, dataTypeClass = User.class,paramType = "body")
//
//    })

}

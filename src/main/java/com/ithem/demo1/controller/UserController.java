package com.ithem.demo1.controller;

import com.ithem.demo1.domain.Enable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class UserController {
    @Value("${server.port}")
    private String a;
    @Autowired
    private Environment environment;
    @Autowired
    private Enable enable;
    @Value("${a}")
    private String a1;
    @Value("${b}")
    private String b;
    @GetMapping
    @ResponseBody
    public String getAll() throws Exception{
        if (true) {
            throw new Exception();
        }
        return "我是全部";
    }
    @GetMapping("/{id}")
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("get"+id);
        System.out.println(a);
        System.out.println(environment.getProperty("server.port"));
        System.out.println(enable.toString());
        System.out.println(a1);
        System.out.println(b);
        return "get"+id;
    }
    /*更新操作*/
    @ResponseBody
    @PutMapping("/{id}")
    public String updateId(@PathVariable Integer id,@RequestBody Enable enable){
        System.out.println(enable);
        return "根据id修改"+id;
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteId(@PathVariable Integer id){
        return "根据id删除"+id;
    }
    @PostMapping
    @ResponseBody
    /*@RequestBody不支持get方式请求*/
    public String all(@RequestBody Enable enable1){
        System.out.println(enable1);
        return "执行成功";
    }
}

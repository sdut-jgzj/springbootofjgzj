package cn.jgzj.sdut.www.webapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试类")
@RequestMapping(value = "/test")
public class TestController {
    // TODO 测试控制器，之后删除
    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping
    public void getTest() {
        System.out.println("123");
    }
}

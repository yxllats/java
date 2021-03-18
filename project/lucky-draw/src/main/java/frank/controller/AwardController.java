package frank.controller;

import frank.model.Award;
import frank.model.User;
import frank.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
//相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了
//但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
@RequestMapping("/award")
//是一个用来处理请求地址映射的注解,可用于类或者方法上
//用于类上,表示类中的所有响应请求的方法都是以该地址作为父路径
public class AwardController {

    @Autowired
    private AwardService awardService;

    /**
     *@GetMapping用于处理请求方法的GET类型，@PostMapping用于处理请求方法的POST类型等。
     *
     *如果我们想使用传统的@RequestMapping注释实现URL处理程序，那么它应该是这样的：
     *
     * @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
     *
     * 新方法可以简化为：
     *
     * @GetMapping("/get/{id}")
     */
    @PostMapping("/add")
    public Object add(@RequestBody Award award, HttpSession session){//插入时，请求数据中不带id
        User user = (User) session.getAttribute("user");
        award.setSettingId(user.getSettingId());
        awardService.add(award);
        return award.getId();//数据库插入时，自动设置id为自增主键：返回前端，否则有bug
    }

    @PostMapping("/update")
    public Object update(@RequestBody Award award){//修改是id修改
        awardService.update(award);
        return null;
    }
    //@PathVariable中的值绑定路径变量，如果@PathVariable没有值，绑定为变量名
    @GetMapping("/delete/{id}")
    public Object delete(@PathVariable Integer id){
        awardService.delete(id);
        return null;
    }
}

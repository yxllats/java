package frank.controller;

import frank.model.User;
import frank.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping("/add/{awardId}")
    public Object add(@PathVariable Integer awardId, @RequestBody List<Integer> memberIds){
        recordService.add(awardId, memberIds);
        return null;
    }

    //业务上，一个人只能抽一个奖
    @GetMapping("/delete/member")
    public Object deleteByMemberId(Integer id){
        recordService.deleteByMemberId(id);
        return null;
    }

    @GetMapping("/delete/award")
    public Object deleteByAwardId(Integer id){
        recordService.deleteByAwardId(id);
        return null;
    }


    @GetMapping("/delete/setting")
    public Object deleteBySettingId(HttpSession session){
        User user = (User) session.getAttribute("user");
        recordService.deleteBySettingId(user.getSettingId());
        return null;
    }
}

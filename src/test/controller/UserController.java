package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getAllUser" ,method = RequestMethod.GET )
    @ResponseBody
    public BaseResultBean<ArrayList<UserInfo>> getAllUser(){
        ArrayList<UserInfo> infos=new ArrayList<>();
        infos.add(new UserInfo("1","刘文豪","18354544145","32"));
        infos.add(new UserInfo("2","蔡军","18354544145","31"));
        infos.add(new UserInfo("3","范导","18354544145","98"));
        infos.add(new UserInfo());

        BaseResultBean<ArrayList<UserInfo>> allUserInfo=new BaseResultBean<>();
        allUserInfo.setCode(200);
        allUserInfo.setMsg("成功");
        allUserInfo.setResult(infos);
        return allUserInfo;
    }

    @RequestMapping(value = "/getUserById" ,method = RequestMethod.POST )
    @ResponseBody
    public BaseResultBean<ArrayList<UserInfo>> getUserById(HttpServletRequest request){
        ArrayList<UserInfo> infos=new ArrayList<>();
        infos.add(new UserInfo("1","刘文豪","18354544145","32"));
        infos.add(new UserInfo("2","蔡军","18354544145","31"));
        infos.add(new UserInfo("3","范导","18354544145","98"));
        infos.add(new UserInfo());
        Iterator<UserInfo> iterator = infos.iterator();
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            if(!request.getParameter("name").equals(userInfo.getName())){
                iterator.remove();
            }
        }

        BaseResultBean<ArrayList<UserInfo>> allUserInfo=new BaseResultBean<>();
        allUserInfo.setCode(200);
        allUserInfo.setMsg("成功");
        allUserInfo.setResult(infos);
        return allUserInfo;
    }
}

package com.peng.controller;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.peng.POJO.UserPOJO;
import com.peng.entity.User;
import com.peng.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    
   
    @RequestMapping(value="login",method=RequestMethod.POST)
    public ModelAndView login(UserPOJO userPOJO,HttpSession session){
    	ModelAndView modelAndView = new ModelAndView();
    	User user = userService.queryUserByNPR(userPOJO);
    	if (null!=user) {
    		session.setAttribute("currentUser", user);
    		modelAndView.setViewName("redirect:/main.jsp");
		}else{
			modelAndView.setViewName("redirect:/login.jsp");
		}
    	return modelAndView;
        
    }
    
    
    @RequestMapping(value="customerManagerComboList",method=RequestMethod.POST)
    public ModelAndView customerManagerComboList(){
    	
    	return null;
    }
    
    
    
    
    
    
    
 
    
/*    @RequestMapping("login")
    public String login(User user,Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new 
                UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            subject.login(usernamePasswordToken);
            logger.info("======登陆成功=======");
            return "success";
        } catch (Exception e) {
            logger.error("======登陆异常=======");
            //model.addAttribute("msg", "用户名或者密码错误,登陆失败");
            e.printStackTrace();
            return "/index";
        }
    }
*/    
    
    
    
}

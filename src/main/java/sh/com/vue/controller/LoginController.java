package sh.com.vue.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sh.com.vue.model.User;

import com.google.gson.Gson;

@RestController
public class LoginController {
	
	/**
	 * POST 模式，参数加@RequestBody
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String loginAPI(@RequestBody User user) throws Exception{
		 
		Gson gson=new Gson();
		Callback cb = new Callback();
		cb.setState("success");
		return gson.toJson(cb, Callback.class);
	}
	 
}

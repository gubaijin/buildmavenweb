package com.spring.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class AgeController {
/*
	@Autowired
	private RedisUtils redisUtils;*/

	@RequestMapping("/age")
	public String age(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
					  Model model) {
//		System.out.println("!!!!!!!!!!!!!!!!!" + redisUtils.get("gbj"));
		model.addAttribute("name", name);
		return "/demo/age";
	}
	
/*	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/age")
	public String age(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		//通过name查询user对象
		User user = userMapper.selectByPrimaryKey(name);
		
		if(null != user){
			model.addAttribute("name", user.getName());
			model.addAttribute("age", user.getAge()+"");
		}
		return "/demo/age";
	}*/
}

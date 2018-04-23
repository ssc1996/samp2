package cn.sep.samp2.samp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="initSys")
public class InitSystemController {
	@RequestMapping(value="initSys")
	public String initSystem(){
		
		return null;
	}
}

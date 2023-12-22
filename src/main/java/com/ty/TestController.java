package com.ty;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/info")
	public String showMessage(ModelMap map) {
		
		map.put("appVersion", "Snap-shoot-5.6.6");
		map.put("devName", "vikas");
		
		Map<String, Double> map1= new LinkedHashMap<>();
		map1.put("memory", 1.2);
		map1.put("RAM", 6.0);
		
		map.addAllAttributes(map1);
		
		return "myMessage.jsp";
	}
}

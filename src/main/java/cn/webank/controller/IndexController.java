package cn.webank.controller;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.webank.common.Product;

@Controller
@RequestMapping("/index")
public class IndexController {

	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Value("#{env['name']}")
	String name;
	@Value("#{env['age']}")
	int age;
	@Value("#{env['address']}")
	String address;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/user")
	public String index(ModelMap mm) {
		mm.addAttribute("username", name);
		List list = new LinkedList();
		list.add(name);
		list.add(age);
		list.add(address);
		list.add(Product.ML.name());
		list.add(Product.DS.getProCode());
		list.add(Product.values()[2].toString());
		mm.addAttribute("info", list);
		logger.info(name + "visits the index file");
		return "user";
	}
}

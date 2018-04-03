package edu.dmacc.spring.dogcompetitionregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EntryController {
	@Autowired EntryDao dao;
	
	@RequestMapping(value="/form")
	public ModelAndView entry() {
		System.out.println("In model and view form");
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("entryForm");
		modelAndView.addObject("entry",new Entry());  
		
		return modelAndView;
}
	@RequestMapping(value = "/result")
	public ModelAndView processUser(Entry entry) { 
		ModelAndView modelAndView = new ModelAndView();
		dao.insertEntry(entry); 
		modelAndView.setViewName("entryResult"); 
		modelAndView.addObject("u", entry); 
		return modelAndView;
}

@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Entry> allEntries = dao.getAllEntries();
		modelAndView.setViewName("viewAllEntries");
		modelAndView.addObject("all",allEntries);
		return modelAndView;
}

@Bean
public EntryDao dao() {
	EntryDao bean = new EntryDao();
	return bean;
}
	
}

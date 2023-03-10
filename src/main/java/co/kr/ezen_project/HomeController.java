package co.kr.ezen_project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.ApplicationBufferHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.ezen_project.service.SangpumService;
import co.kr.ezen_project.vo.SangCateVO;
import co.kr.ezen_project.vo.SearchVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	SangpumService sangpumService;
	
	

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, String orby) {
		
		home_top(model);
		if(orby == null) {
			model.addAttribute("photo",sangpumService.getSangAll());
		}else {
			SearchVO vo = new SearchVO();
			vo.setKeyword("%");
			vo.setOrby(orby);
			model.addAttribute("photo",sangpumService.getSangCate(vo));
		}
		
		return "home";
	}
	
	public void home_top(Model model) {
		SearchVO searchvo = new SearchVO();
		searchvo.setKeyword("_");
		model.addAttribute("mainTypeOne", sangpumService.getSC_cateName(searchvo));
		for( SangCateVO vo1 : sangpumService.getSC_cateName(searchvo)) {		//메뉴에 들어갈 카테고리 가져오기
			searchvo.setKeyword(vo1.getSangCode()+"__");
			model.addAttribute("listA"+vo1.getSangCode() , sangpumService.getSC_cateName(searchvo));
			for(SangCateVO vo2 : sangpumService.getSC_cateName(searchvo)) {
				searchvo.setKeyword(vo2.getSangCode()+"__");
				model.addAttribute("listB"+vo2.getSangCode() , sangpumService.getSC_cateName(searchvo));
			}
		}
		
		searchvo.setKeyword("1__");												//공용 카테고리 가져오기
		model.addAttribute("listA"+1 , sangpumService.getSC_cateName(searchvo));
		for(SangCateVO vo2 : sangpumService.getSC_cateName(searchvo)) {
			searchvo.setKeyword(vo2.getSangCode()+"__");
			model.addAttribute("listB"+vo2.getSangCode() , sangpumService.getSC_cateName(searchvo));
		}
	}
	
}

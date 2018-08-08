/**
 * 
 */
package com.mechineTest.JavamechineTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author akhil
 *
 */
@Controller
public class LogInController {

	@RequestMapping(value = "/")
	public String logIn() {
		return "logIn";
	}

}

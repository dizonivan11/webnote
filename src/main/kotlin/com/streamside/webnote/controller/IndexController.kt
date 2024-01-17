package com.streamside.webnote

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.stereotype.Controller
import org.springframework.ui.Model

@Controller
class IndexController {

    @GetMapping("/")
	fun index(@RequestParam("name", required = false, defaultValue = "World") name: String, model: Model): String {
		model.addAttribute("name", name)
		return "index"
	}
}
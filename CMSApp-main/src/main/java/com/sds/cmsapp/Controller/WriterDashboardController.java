package com.sds.cmsapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WriterDashboardController {

	@GetMapping("/writer/dashboard")
	public String getWriterDashboard() {
		return "writer/dashboard";
	}
}
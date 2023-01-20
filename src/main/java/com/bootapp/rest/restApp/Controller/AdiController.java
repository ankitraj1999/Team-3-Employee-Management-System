package com.bootapp.rest.restApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdiController {
	@GetMapping("/api/Adi")
	public String Hello()
	{
		return "Bala Shaitan KA saala";
	}

}

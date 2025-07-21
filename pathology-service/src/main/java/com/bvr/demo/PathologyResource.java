package com.bvr.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("d1", "Dengue", "be safe from still water"),
			new Disease("d2", "HeadAche", "hot water vapor"),
			new Disease("d3", "Corona", "Wash hands and stay safe")
			
			);
	
	@RequestMapping("/diseases")
	public DiseaseList diseases() {
		DiseaseList diseaseList = new DiseaseList();
		diseaseList.setDiseases(diseases);
		return diseaseList;
	}

	@RequestMapping("/diseases/{id}")
	public Disease disease(@PathVariable("id") String id) {
		return diseases.stream()
				.filter(d -> d.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
}

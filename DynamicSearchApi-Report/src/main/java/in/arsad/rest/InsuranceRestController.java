package in.arsad.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.arsad.binding.request.SearchRequest;
import in.arsad.binding.response.PlanResponse;
import in.arsad.service.InsurancePlanService;
import net.bytebuddy.asm.Advice.Return;

@RestController
public class InsuranceRestController {
	
	@Autowired
	private InsurancePlanService service;
	@PostMapping("/plans")
	public ResponseEntity<List<PlanResponse>> getPlans(SearchRequest request){
		List<PlanResponse> searchPlans=service.searchPlan(request);
		return new ResponseEntity<>(searchPlans,HttpStatus.OK);
	}
    @GetMapping("/planName")
	public ResponseEntity<List<String>> getPlanName() {

		List<String> planName = service.getUniquePlanName();
		return new ResponseEntity<>(planName, HttpStatus.OK);
	}
    @GetMapping("/planStatus")
   	public ResponseEntity<List<String>> getPlanStatus() {

   		List<String> status = service.getUniquePlanStatus();
   		return new ResponseEntity<>(status, HttpStatus.OK);
   	}
}

package in.arsad.service;

import java.util.List;

import in.arsad.binding.request.SearchRequest;
import in.arsad.binding.response.PlanResponse;

public interface InsurancePlanService {
	public List<PlanResponse> searchPlan(SearchRequest request);
	public List<String> getUniquePlanName();
	public List<String> getUniquePlanStatus();

}

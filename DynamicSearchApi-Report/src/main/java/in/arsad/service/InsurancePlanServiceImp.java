package in.arsad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.arsad.binding.request.SearchRequest;
import in.arsad.binding.response.PlanResponse;
import in.arsad.entity.InsurancePlanEntity;
import in.arsad.repo.InsurancePlanRepository;

@Service
public class InsurancePlanServiceImp implements InsurancePlanService {
	@Autowired
	private InsurancePlanRepository repo;
	@Override
	public List<PlanResponse> searchPlan(SearchRequest request) {
		
		InsurancePlanEntity entity=new InsurancePlanEntity();
		if(request.getPlanName()!=null && !request.getPlanName().equals(""))
		{
			entity.setPlanName(request.getPlanName());
		}
		if(request.getPlanStatus()!=null && !request.getPlanStatus().equals("")) 
			
		{
			entity.setPlanStatus(request.getPlanStatus());
		}
		Example<InsurancePlanEntity> of=Example.of(entity);
		List<InsurancePlanEntity> findAll=repo.findAll();
		List<PlanResponse> plans=new ArrayList<>();
		for(InsurancePlanEntity plan :findAll) {
			PlanResponse presp=new PlanResponse();
			BeanUtils.copyProperties(plan, presp);
			plans.add(presp);
			
			
		}
		
		return plans;
	}
	@Override
	public List<String> getUniquePlanName() {
		return repo.getPlanName();
	}
	@Override
	public List<String> getUniquePlanStatus() {
		return repo.getPlanStatus();
	}
	
}

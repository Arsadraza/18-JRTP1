package in.arsad.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.arsad.entity.InsurancePlanEntity;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlanEntity, Serializable>{
    
	@Query("select distinct planName from InsurancePlanEntity")
	public List<String> getPlanName();
	@Query("select distinct planStatus from InsurancePlanEntity")
	public List<String> getPlanStatus();
}

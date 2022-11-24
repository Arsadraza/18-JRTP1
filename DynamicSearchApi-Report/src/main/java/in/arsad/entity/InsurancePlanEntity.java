package in.arsad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="INSURANCE_PLAN")
@Data
public class InsurancePlanEntity {
	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	private Integer planId;
	@Column(name="PLAN_NAME")
	private String planName;
	@Column(name="PLAN_HOLDER_NAME")
	private String planHolderName;
	@Column(name="PLAN_HOLDER_SSN")
	private Long planHolderSsn;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	

}

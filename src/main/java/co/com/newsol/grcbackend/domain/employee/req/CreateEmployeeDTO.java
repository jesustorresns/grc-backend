package co.com.newsol.grcbackend.domain.employee.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CreateEmployeeDTO(
	String firstName,
	String lastName,
	@Email String personalEmail,
	String postalCode,
	String gender,
	String phoneNumber,
	String jobTitle,
	String documentType,
	String documentNumber,
	String companyAddress,
	String management,
	String company,
	String companyName,
	String contractType,
	String directManager,
	String workModality,
	String costCenter,
	Boolean managesShifts,
	Boolean isTemporary,
	String jobFunction,
	String additionalFunctions,
	@NotNull CreateServiceRequestInformationDTO serviceRequest,
	@NotNull CreateBusinessSolutionDTO businessSolution) {
}

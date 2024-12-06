package co.com.newsol.grcbackend.domain.employee.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.List;

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
	String contractNumber,
	String directManager,
	String workModality,
	String costCenter,
	String officeCity,
	String jobFunction,
	String additionalFunctions,
	@NotNull CreateServiceRequestInformationDTO serviceRequest,
	@NotNull List<CreateBusinessSolutionDTO> businessSolution,
	List<String> collaborativeSolutionType) {
}

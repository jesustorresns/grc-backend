package co.com.newsol.grcbackend.domain.employee.req;

import java.time.LocalDate;

public record CreateServiceRequestInformationDTO(
	LocalDate requestDate,
	LocalDate startDate,
	LocalDate endDate) {
}

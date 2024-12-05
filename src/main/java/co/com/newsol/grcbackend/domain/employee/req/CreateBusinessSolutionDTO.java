package co.com.newsol.grcbackend.domain.employee.req;

import java.util.List;

public record CreateBusinessSolutionDTO(
	String solutionType,
	List<String> solution,
	List<String> collaborativeSolutionType) {
}

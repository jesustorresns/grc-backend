package co.com.newsol.grcbackend.domain.employee.controller;

import co.com.newsol.grcbackend.domain.employee.req.CreateEmployeeDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

	@Operation(summary = "Solicitud de creacion de usuario y empleado", description = "Crea una solicitud de creación de un nuevo empleado con los detalles proporcionados.")
	@ApiResponse(responseCode = "201")
	@PostMapping
	public ResponseEntity<Void> createEmployee(@Valid @RequestBody CreateEmployeeDTO createEmployee) {
		log.info("Solicitud de creacion de empleado creada exitosamente");
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}

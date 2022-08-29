package com.api.helprback;

import com.api.helprback.domain.Chamado;
import com.api.helprback.services.ChamadoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelprbackApplicationTests {

	@Autowired
	private ChamadoService chamadoService;

	@Test
	void testContextReportChamadosTecnicoSemanal() {
		Integer idTecnico = 1;
		List<Chamado> testObj = chamadoService.reportSemanalChamadosTecnico(idTecnico);
		Assertions.assertTrue(testObj.size()>0);
	}
}

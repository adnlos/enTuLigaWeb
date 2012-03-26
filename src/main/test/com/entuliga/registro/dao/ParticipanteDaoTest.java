package com.entuliga.registro.dao;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entuliga.beanFactory.BeanFactory;
import com.entuliga.registro.dto.ParticipanteDto;

public class ParticipanteDaoTest {

	private static final Logger logger = Logger.getLogger(ParticipanteDao.class);

	@Test
	public void testInsertParticipante() {
		logger.debug("Inicia junit participante");
		Boolean res = true;
		try {
			ParticipanteDao participanteDao = (ParticipanteDao) BeanFactory.getBean("ParticipanteDao");
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setIdParticipante(29);
			participanteDto.setApellidoMaternoP("Quintanilla");
			participanteDto.setApellidoPaternoP("Gomez");
			participanteDto.setEstadoP("estado");
			participanteDto.setFechaNacimientoP(new Date());
			participanteDto.setIdGeneroP(1);
			participanteDto.setMailP("mailmailmail");
			participanteDto.setUsuarioP("adnlos");
			participanteDto.setPasswordP("passsss");
			participanteDto.setNombreP("ADN");
			participanteDto.setEstadoP("1");
			logger.debug("###############");
			res = participanteDao.insertParticipante(participanteDto);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		logger.debug("Finaliza junit participante");
	}

}

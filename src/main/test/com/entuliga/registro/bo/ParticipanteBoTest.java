package com.entuliga.registro.bo;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entuliga.beanFactory.BeanFactory;
import com.entuliga.registro.dto.ParticipanteDto;

public class ParticipanteBoTest {
	
	private static final Logger logger = Logger.getLogger(ParticipanteBoTest.class);
	@Test
	
	public void testInsertParticipante() {
		Boolean res = true;
		try {
			ParticipanteBo participanteBo = (ParticipanteBo) BeanFactory.getBean("ParticipanteBo");
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setIdParticipante(31);
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
			res = participanteBo.insertParticipante(participanteDto);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
	}

}

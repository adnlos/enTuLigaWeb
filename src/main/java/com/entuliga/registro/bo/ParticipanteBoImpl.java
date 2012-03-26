package com.entuliga.registro.bo;

import org.apache.log4j.Logger;

import com.entuliga.registro.dao.ParticipanteDao;
import com.entuliga.registro.dto.ParticipanteDto;

public class ParticipanteBoImpl implements ParticipanteBo{

	private static final Logger logger = Logger.getLogger(ParticipanteBoImpl.class);
	private ParticipanteDao participanteDao;
	
	public Boolean insertParticipante(ParticipanteDto paramParticipanteDto) {
		logger.debug("Inicia Bo InserParticipante");
		Boolean res = true;
		try {
			res = participanteDao.insertParticipante(paramParticipanteDto);
		} catch (Exception e) {
			logger.error(e);
			res = false;
		}
		logger.debug("Finaliza Bo InserParticipante");
		return res;
	}

	public ParticipanteDao getParticipanteDao() {
		return participanteDao;
	}

	public void setParticipanteDao(ParticipanteDao participanteDao) {
		this.participanteDao = participanteDao;
	}
	


}

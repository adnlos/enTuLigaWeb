package com.entuliga.registro.facade;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.entuliga.registro.bo.ParticipanteBo;
import com.entuliga.registro.dto.ParticipanteDto;
import com.entuliga.registro.vo.ParticipanteVo;

public class ParticipanteFacade {
	
	private static final Logger logger = Logger.getLogger(ParticipanteFacade.class);
	ParticipanteBo participanteBo;
	
	public Map<String, Object> guardaParticipante (ParticipanteVo participanteVo){
		logger.debug("Inicia Facade InsertParticipante");
		Map<String, Object> jsonSeries = new TreeMap<String, Object>();
		Boolean insert = Boolean.FALSE;
		//El objeto Vo se guardara en el Objeto Dto
		try {
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setNombreP(participanteVo.getNombreP());
			participanteDto.setApellidoPaternoP(participanteVo.getApellidoPaternoP());
			participanteDto.setApellidoMaternoP(participanteVo.getApellidoMaternoP());
			participanteDto.setFechaNacimientoP(participanteVo.getFechaNacimientoP());
			participanteDto.setIdGeneroP(participanteVo.getIdGeneroP());
			participanteDto.setEstadoP("1");
			participanteDto.setMailP(participanteVo.getMailP());
			participanteDto.setUsuarioP(participanteVo.getUsuarioP());
			participanteDto.setPasswordP(participanteVo.getPasswordP());
			insert = participanteBo.insertParticipante(participanteDto);
			
		} catch (Exception e) {
			logger.error(e);
			insert =false;
		}
		jsonSeries.put("insert", insert);
		return jsonSeries;
	}

	public ParticipanteBo getParticipanteBo() {
		return participanteBo;
	}

	public void setParticipanteBo(ParticipanteBo participanteBo) {
		this.participanteBo = participanteBo;
	}

}

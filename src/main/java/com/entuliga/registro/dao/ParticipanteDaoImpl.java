package com.entuliga.registro.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.entuliga.registro.dto.ParticipanteDto;


public class ParticipanteDaoImpl implements ParticipanteDao {
	
	private static final Logger logger = Logger.getLogger(ParticipanteDaoImpl.class);
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public boolean insertParticipante(ParticipanteDto ParamparticipanteDto) {
		Boolean guarda = true;
		try {
			hibernateTemplate.save(ParamparticipanteDto);
		} catch (Exception e) {
			logger.error(e);
			guarda = false;
		}
		return guarda;
	}
	



}

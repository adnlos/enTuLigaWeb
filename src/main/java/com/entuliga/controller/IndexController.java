package com.entuliga.controller;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entuliga.beanFactory.BeanFactory;
import com.entuliga.registro.controller.ParticipanteController;
import com.entuliga.registro.facade.ParticipanteFacade;
import com.entuliga.registro.form.ParticipanteForm;
import com.entuliga.util.Constantes;

@Controller
public class IndexController {
		private static final Logger logger = Logger.getLogger(ParticipanteController.class);
		//regresa la vista
		private static final String INDEX_APP = "indexApp";
		private Map<String, Object> jsonMap;
		private ParticipanteFacade participanteFacade;

		@RequestMapping("/index.htm")
		public ModelAndView registroParticipante(){
			logger.info("Inicia View Registro Participante");
			ParticipanteForm participanteForm = new ParticipanteForm();
			participanteFacade = (ParticipanteFacade) BeanFactory.getBean("ParticipanteFacade");
			logger.info("Termina View Registro Participante");
			return new ModelAndView(INDEX_APP, "command",participanteForm);
		}		
		
		@RequestMapping(value= "/registroNuevoUsuario", method = RequestMethod.POST)
		public ModelAndView registroNuevoParticipante(@ModelAttribute("participante") ParticipanteForm participanteForm, BindingResult result){
			logger.info("inicia controler participante");
			Map<String , Object> jsonMap = new TreeMap<String, Object>();
			participanteFacade = (ParticipanteFacade) BeanFactory.getBean(Constantes.PARTICIPANTE_FACADE);
			jsonMap = participanteFacade.guardaParticipante(participanteForm.getParticipanteVo());
			logger.info("fonaliza controller participante");
			return new ModelAndView("indexApp", jsonMap);
		}
		

		public Map<String, Object> getJsonMap() {
			return jsonMap;
		}

		public void setJsonMap(Map<String, Object> jsonMap) {
			this.jsonMap = jsonMap;
		}

		public ParticipanteFacade getParticipanteFacade() {
			return participanteFacade;
		}

		public void setParticipanteFacade(ParticipanteFacade participanteFacade) {
			this.participanteFacade = participanteFacade;
		}
		
		
}
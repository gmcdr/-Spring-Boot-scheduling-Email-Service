package com.agendamento.tranca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.agendamento.tranca.model.Scheduling;
import com.agendamento.tranca.repository.SchedulingRepository;

@Service
public class SchedulingService {
	
	@Autowired
	private SchedulingRepository repository;
	
	@Autowired
	private JavaMailSender emailSender;
	
	public Scheduling createScheduling(Scheduling scheduling) {
		sendMsg(scheduling);
		return repository.save(scheduling);
	}
	
	
	 private void sendMsg(Scheduling scheduling) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("isabelacarvalhotrancista@gmail.com");
	        message.setTo("isabelacarvalhotrancista@gmail.com");
	        message.setTo(scheduling.getEmail());
	        message.setSubject("Preferência de Agedamento: ");
	        message.setText(scheduling.toString());
	        emailSender.send(message);
	    }
<<<<<<< HEAD
	 	 

	 
	 public Scheduling findByDate(Scheduling scheduling) {
		 return repository.findByData(scheduling.getData());
	 }
	 
	 public Scheduling atualizarAgendamento(Scheduling scheduling) {
		 return repository.save(scheduling);
	 }
	 
	 public Scheduling findAgendamento(Long id) {
		 return repository.getById(id);
	 }
	 
=======
>>>>>>> 9e6afe93c57db1bc665925c862f4717a829fcdce

}

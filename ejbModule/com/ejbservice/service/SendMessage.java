package com.ejbservice.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class SendMessage implements SendMessageRemote, SendMessageLocal {

	public SendMessage() {
   
    }

	@Override
	public void mensagem(String mensagem) {
		System.out.println("Imprimindo a mensagem do cliente ->"+mensagem);
		
	}

}

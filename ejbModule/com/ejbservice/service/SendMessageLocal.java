package com.ejbservice.service;

import javax.ejb.Local;

@Local
public interface SendMessageLocal {
	public void mensagem(String mensagem);
}

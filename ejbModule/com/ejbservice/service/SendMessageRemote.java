package com.ejbservice.service;

import javax.ejb.Remote;

@Remote
public interface SendMessageRemote {
    public void mensagem(String mensagem);
}

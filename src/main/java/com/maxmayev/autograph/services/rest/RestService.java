package com.maxmayev.autograph.services.rest;

import com.maxmayev.autograph.domain.Message;

public interface RestService {
    Message saveOrUpdateMessage(Message message, Integer id);
    void deleteConsumer(Integer id);
}

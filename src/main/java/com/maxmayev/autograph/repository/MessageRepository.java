package com.maxmayev.autograph.repository;

import com.maxmayev.autograph.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Integer> {
    //Message findById(int id);
    //Message save(Message message);
    //Message saveConsumerOrders(Message message, List<Order> orders);
    Message deleteById(int id);
   /* Message deleteById(int id);
    Message saveConsumerOrders(Message message, List<Order> orders);*/
    //Iterable<> findAllByGoodOrBadEquals(int goodOrBad);

}

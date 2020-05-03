package com.maxmayev.autograph.services.message;

import com.maxmayev.autograph.domain.Message;
import com.maxmayev.autograph.domain.User;
import com.maxmayev.autograph.repository.MessageRepository;
import com.maxmayev.autograph.services.consumer.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.support.SessionStatus;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /*@Override
    public Boolean addConsumer(Message message, Errors errors) {
        if (errors.hasErrors()) return false;
        log.debug(message.toString());
        return true;
    }*/

    @Override
    public void sendMessage(Message message, SessionStatus sessionStatus) {
        messageRepository.save(message);
        sessionStatus.setComplete();
    }

    @Override
    public void deleteMessage(String id) {
        messageRepository.deleteById(Integer.parseInt(id));
        log.info("Delete message with id " + id);
    }

    @Override
    public void showLkForm(Model model, Authentication authentication) {
        User user = (User)authentication.getPrincipal();
        log.debug(user.toString());
        List<Message> messages = new ArrayList<>();
        messageRepository.findAll().forEach(messages::add);
        model.addAttribute("messages",messages);
        model.addAttribute("user",user);
    }



}

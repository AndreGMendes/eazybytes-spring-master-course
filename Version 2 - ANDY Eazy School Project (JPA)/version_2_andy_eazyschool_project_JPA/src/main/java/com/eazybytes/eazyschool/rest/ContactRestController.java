package com.eazybytes.eazyschool.rest;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
/*@Controller*/
@RestController
@RequestMapping(path = "/api/contact")
public class ContactRestController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/getMessagesByStatus")
/** @ResponseBody * Not needed since we've changed @Controller to @RestController*/
    public List<Contact> getMessagesByStatus (@RequestParam(name = "status") String status ) {

        return contactRepository.findByStatus(status);
    }

    @GetMapping("/getAllMsgsByStatus")
/** @ResponseBody * Not needed since we've changed @Controller to @RestController*/
    public List<Contact> getAllMsgsByStatus (@RequestBody Contact contact) {

        if (null != contact && null != contact.getStatus()) {
            return contactRepository.findByStatus(contact.getStatus());
        } else {
            return List.of();
        }
    }
}

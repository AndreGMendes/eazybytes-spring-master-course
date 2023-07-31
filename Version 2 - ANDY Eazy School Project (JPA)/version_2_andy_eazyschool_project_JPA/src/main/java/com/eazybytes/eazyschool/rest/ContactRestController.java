package com.eazybytes.eazyschool.rest;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(path = "/api/contact")
public class ContactRestController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/getMessagesByStatus")
    @ResponseBody
    public List<Contact> getMessagesByStatus (@RequestParam(name = "status") String status ) {

        return contactRepository.findByStatus(status);
    }

}

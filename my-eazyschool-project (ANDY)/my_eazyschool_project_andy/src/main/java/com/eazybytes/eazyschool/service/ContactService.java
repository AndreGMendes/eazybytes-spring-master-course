package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@Service
@RequestScope
public class ContactService {

    /**Removed because with annotation '@Slf4j'
     * the log object is created by Lombok automatically */
   /* private static Logger log = LoggerFactory.getLogger(ContactService.class);*/

    public ContactService() {
        System.out.println("Contact Service Bean Initialized");
    }

    private int counter = 0;


    /**
    * Save Contact Details into DB
    * @param contact
    * @return boolean
    * */

    public boolean saveMessageDetails (Contact contact) {
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}

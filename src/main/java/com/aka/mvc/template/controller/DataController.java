package com.aka.mvc.template.controller;

import com.aka.mvc.template.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by james on 28/08/2016.
 */
@RestController
@RequestMapping("/data/")
public class DataController {

    @RequestMapping(value = "/{searchString}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String searchString) {
        String result = "Received search: "+ searchString;
        return result;
    }

    @RequestMapping(value = "/{searchString}/search.json", method=RequestMethod.GET)

    public Item getItem(@PathVariable String searchString) {
        Item item = new Item();
        item.setDate1(new Date());
        item.setNum1(1234);
        item.setString1("HELLO EVERYBODY");
        item.setString2("Hi there \"everybody\" hope you are well.");

        return item;
    }

}

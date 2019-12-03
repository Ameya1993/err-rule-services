package com.err.rule.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.err.rule.model.*;

import java.io.IOException;
import java.util.HashMap;

@RestController
public class RuleController {

    @PutMapping ("/insert")
    public Rule insertRule (@RequestBody Rule rule) throws IOException {


        return rule;
    }

}
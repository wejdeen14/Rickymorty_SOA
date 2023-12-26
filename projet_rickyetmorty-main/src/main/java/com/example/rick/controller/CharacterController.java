package com.example.rick.controller;

import com.example.rick.entity.search;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;

@Controller
public class CharacterController {

    @Value("${api.url}")
    private String apiUrl;

   @GetMapping("/search")
    public ModelAndView showSearchPage() {
        return new ModelAndView("search");
    }

    @PostMapping("/search")
    public ModelAndView searchCharacter(@RequestParam String search, Model model) {
        String uri = "https://rickandmortyapi.com/api/character/?name=" + search;
        RequestEntity<Void> requestEntity = new RequestEntity<>(HttpMethod.GET, URI.create(uri));
        RestTemplate restTemplate = new RestTemplate();
        search responseEntity = restTemplate.exchange(requestEntity, search.class).getBody();
        System.out.println(responseEntity);
        ModelAndView modelAndView = new ModelAndView("result");

            modelAndView.addObject("searchResult",responseEntity.getResults());



        return modelAndView;
}}

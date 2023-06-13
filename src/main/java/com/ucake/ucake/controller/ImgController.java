package com.ucake.ucake.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/img")
public class ImgController {

    @GetMapping("/")
    public @ResponseBody String getText(@RequestParam String img) {
        return "resources/static/img/" + img;
    }
}

package com.ucake.ucake.controller;

import com.ucake.ucake.dto.FillingMainPageDto;
import com.ucake.ucake.dto.FillingsDto;
import com.ucake.ucake.service.FillingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fillings")
public class FillingController {
    private final FillingService fillingService;

    public FillingController(FillingService fillingService) {
        this.fillingService = fillingService;
    }

    @GetMapping("/main")
    public List<FillingMainPageDto> getAllForMainPage() {
        return fillingService.getAllFillingsForMainPage();
    }

    @GetMapping()
    public List<FillingsDto> getAllFillings() {
        return fillingService.getAllFillingsDto();
    }
}

package com.ucake.ucake.service;

import com.ucake.ucake.dto.FillingMainPageDto;
import com.ucake.ucake.dto.FillingsDto;
import com.ucake.ucake.mapper.FillingMapper;
import com.ucake.ucake.repository.FillingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FillingService {
    private final FillingRepository fillingRepository;

    public FillingService(FillingRepository fillingRepository) {
        this.fillingRepository = fillingRepository;
    }

    public List<FillingMainPageDto> getAllFillingsForMainPage() {
        return FillingMapper.mapToFillingsMainPageDto(fillingRepository.findAll());
    }

    public List<FillingsDto> getAllFillingsDto() {
        return FillingMapper.mapToFillingsDto(fillingRepository.findAll());
    }
}

package com.ucake.ucake.mapper;

import com.ucake.ucake.dto.FillingMainPageDto;
import com.ucake.ucake.dto.FillingsDto;
import com.ucake.ucake.model.Filling;

import java.util.ArrayList;
import java.util.List;

public class FillingMapper {

    public static FillingMainPageDto mapToFillingMainPageDto(Filling filling) {
        return new FillingMainPageDto(
                filling.getId(),
                filling.getName(),
                filling.getUrlSmallImg()
        );
    }

    public static List<FillingMainPageDto> mapToFillingsMainPageDto(List<Filling> fillings) {
        List<FillingMainPageDto> result = new ArrayList<>();
        for(Filling filling: fillings) {
            result.add(new FillingMainPageDto(
                    filling.getId(),
                    filling.getName(),
                    filling.getUrlSmallImg()
            ));
        }
        return result;
    }

    public static List<FillingsDto> mapToFillingsDto(List<Filling> fillings) {
        List<FillingsDto> result = new ArrayList<>();
        for(Filling filling: fillings) {
            result.add(new FillingsDto(
                    filling.getId(),
                    filling.getName(),
                    filling.getDescription(),
                    filling.getUrlBigImg()
            ));
        }
        return result;
    }
}

package com.example.szpets_back.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.stereotype.Service;

@Service
public class DataService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        /**
     * Verifica se uma data específica é um fim de semana.
     *
     * @param dateStr A data no formato "dd/MM/yyyy".
     * @return true se a data é um sábado ou domingo, false caso contrário.
     * @throws IllegalArgumentException Se a data fornecida não estiver no formato esperado (dd/MM/yyyy).
     */
    public boolean isWeekend(String dateStr) {
        try {
            LocalDate date = LocalDate.parse(dateStr, DATE_FORMATTER);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de data invalido");
        }
    }
}
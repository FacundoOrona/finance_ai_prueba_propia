package com.alura.finance_ai.finanzas.dto;

import java.math.BigDecimal;
import java.util.Map;

public record ResumenMensualResponse(
        int anio,
        int mes,
        Map<String, BigDecimal> gastosPorCategoria
) {
}

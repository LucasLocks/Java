package POO2.Agenda_Compromissos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compromisso {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;
    private static final DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Compromisso(LocalDate dataInicio, LocalDate dataFim, String descricao) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
    }

    public boolean pertencePeriodo(LocalDate inicioPeriodo, int numeroDias) {
        LocalDate fimPeriodo = inicioPeriodo.plusDays(numeroDias);
        return (dataInicio.isAfter(inicioPeriodo) || dataInicio.isEqual(inicioPeriodo)) && dataInicio.isBefore(fimPeriodo);
    }

    public String getDataInicioFormatada() {
        return dataInicio.format(formatoBrasileiro);
    }

    public String getDataFimFormatada() {
        return dataFim.format(formatoBrasileiro);
    }

    public String getDescricao() {
        return descricao;
    }
}
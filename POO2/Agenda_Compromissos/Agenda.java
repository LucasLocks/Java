package POO2.Agenda_Compromissos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso novo) {
        compromissos.add(novo);
    }

    public String verificarCompromissos(int numeroDias) {
        LocalDate hoje = LocalDate.now();
        StringBuilder resultado = new StringBuilder("Compromissos nos próximos " + numeroDias + " dias:\n");
        boolean encontrou = false;

        for (Compromisso c : compromissos) {
            if (c.pertencePeriodo(hoje, numeroDias)) {
                resultado.append("➡ ").append(c.getDescricao())
                        .append(" | Início: ").append(c.getDataInicioFormatada())
                        .append(" | Fim: ").append(c.getDataFimFormatada()).append("\n");
                encontrou = true;
            }
        }
        return encontrou ? resultado.toString() : "Nenhum compromisso encontrado nesse período.";
    }
}
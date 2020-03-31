package br.com.lsena.centralerros.domain;


import br.com.lsena.centralerros.domain.enums.LogLevel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@Entity
public class Log extends AbstractDomain<Long> {

    @Enumerated(EnumType.STRING)
    private LogLevel level;
    private String descricao;
    private String log;
    private String origem;
    private LocalDate dataEvento;
    private Integer qtEvento;
}

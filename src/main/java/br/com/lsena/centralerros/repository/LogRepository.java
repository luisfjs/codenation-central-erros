package br.com.lsena.centralerros.repository;

import br.com.lsena.centralerros.domain.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {}

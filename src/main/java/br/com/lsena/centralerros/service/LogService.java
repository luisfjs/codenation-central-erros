package br.com.lsena.centralerros.service;

import br.com.lsena.centralerros.domain.Log;
import br.com.lsena.centralerros.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Page<Log> listar(Pageable pageable){
        return logRepository.findAll(pageable);
    }

    public Log salvar(Log log){
        return logRepository.save(log);
    }

    public void deletar(Long id){
        logRepository.deleteById(id);
    }
}

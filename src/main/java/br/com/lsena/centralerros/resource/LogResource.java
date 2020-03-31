package br.com.lsena.centralerros.resource;

import br.com.lsena.centralerros.domain.Log;
import br.com.lsena.centralerros.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("log")
public class LogResource {
    private LogService logService;

    @Autowired
    public LogResource(LogService logService) {
        this.logService = logService;
    }

    @GetMapping
    public Page<Log> listar(Pageable pageable){
        return logService.listar(pageable);
    }

    @PostMapping
    public Log salvar(@RequestBody  @Valid Log log){
        return logService.salvar(log);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") Long id){
        logService.deletar(id);
    }
}

package com.api.helprback.resources;

import com.api.helprback.domain.Tecnico;
import com.api.helprback.domain.dtos.TecnicoDTO;
import com.api.helprback.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/service/tecnicos")
public class TecnicoResources {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value="/{id}")
    public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id){
        System.out.println(id);
        Tecnico obj = this.tecnicoService.findById(id);
        return ResponseEntity.ok().body(new TecnicoDTO(obj));
    }

}

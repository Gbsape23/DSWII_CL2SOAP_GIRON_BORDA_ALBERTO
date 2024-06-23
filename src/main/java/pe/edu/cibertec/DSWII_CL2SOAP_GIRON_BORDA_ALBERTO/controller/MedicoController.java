package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.exception.ResourceNotFoundException;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Medico;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service.MedicoService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/Medico")
public class MedicoController {

    private MedicoService medicoService;

    public ResponseEntity<List<Medico>> listarMedico() {
        List<Medico> medicoList = new ArrayList<>(medicoService.listarMedico());
        if (medicoList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(medicoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obtenerMedicoXId(
            @PathVariable Integer id) {
        Medico medico = medicoService
                .obtenerMedicoxId(id).orElseThrow(
                        () -> new ResourceNotFoundException("La categoria con Id " +
                                id + " no existe"));
        return new ResponseEntity<>(medico, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Medico> registrarMedico(
            @RequestBody Medico medico
    ){
        return new ResponseEntity<>(
                MedicoService.guardarMedico(medico), HttpStatus.CREATED);
    }
}

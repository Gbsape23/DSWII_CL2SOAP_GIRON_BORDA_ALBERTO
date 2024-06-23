package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.exception.ResourceNotFoundException;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Medico;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service.EspecilidadService;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service.MedicoService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/especialidad")
public class EspecilidadController {

    private EspecilidadService especilidadService;

    public ResponseEntity<List<Especilidad>> listarEspecilidad() {
        List<Especilidad> medicoList = new ArrayList<>(especilidadService.listarEspecilidad());
        if (medicoList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(especilidadList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especilidad> obtenerEspecilidadXId(
            @PathVariable Integer id) {
        Medico medico = EspecilidadServiceService
                .obtenerMedicoxId(id).orElseThrow(
                        () -> new ResourceNotFoundException("La categoria con Id " +
                                id + " no existe"));
        return new ResponseEntity<>(especilidad, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Especilidad> registrarEspecilidad(
            @RequestBody Especilidad especilidad
    ){
        return new ResponseEntity<>(
                MedicoService.guardarEspecilidad(especilidad), HttpStatus.CREATED);
    }
}




}

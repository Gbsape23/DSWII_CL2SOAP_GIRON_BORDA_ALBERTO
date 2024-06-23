package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service;

import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Especialidad;


import java.util.List;
import java.util.Optional;

public interface IEspecialidad {
    List<Especialidad> listarEspecialidad();
    Especialidad guardarEspecialidad(Especialidad especialidad);
    Optional<Especialidad> obteneEspecilidadxId(Integer id);
}


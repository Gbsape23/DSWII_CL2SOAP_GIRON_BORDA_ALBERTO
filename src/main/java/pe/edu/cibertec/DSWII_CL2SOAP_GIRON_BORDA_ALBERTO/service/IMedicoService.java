package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service;

import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Medico;

import java.util.List;
import java.util.Optional;

public interface IMedicoService {
    List<Medico> listarMedico();
    Medico guardarMedico(Medico medico);
    Optional<Medico>obtenerMedicoxId(Integer id);
}

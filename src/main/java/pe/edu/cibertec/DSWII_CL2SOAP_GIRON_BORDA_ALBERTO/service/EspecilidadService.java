package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service;

import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Especialidad;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.repository.EspecilidadRepository;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;

public class EspecilidadService implements IEspecialidad{
    private EspecilidadRepository especilidadRepositoryRepository;
    @Override
    public List<Especialidad> listarEspecialidad() {
        return List.of();
    }

    @Override
    public Especialidad guardarEspecialidad(Especialidad especialidad) {
        return null;
    }

    @Override
    public Optional<Especialidad> obteneEspecilidadxId(Integer id) {
        return Optional.empty();
    }
}

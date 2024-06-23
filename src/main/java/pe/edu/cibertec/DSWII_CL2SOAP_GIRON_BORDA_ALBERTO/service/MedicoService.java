package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd.Medico;
import pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class MedicoService  implements IMedicoService {
    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> listarMedico() {
        return medicoRepository.findAll();
    }

    @Override
    public static Medico guardarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }


    @Override
    public Optional<Medico> obtenerMedicoxId(Integer id) {

        Optional<Medico> medico
                = medicoRepository.findById(id);
        if (medico.isEmpty()) {
            return Optional.empty();
        }
        return medico;
    }
}

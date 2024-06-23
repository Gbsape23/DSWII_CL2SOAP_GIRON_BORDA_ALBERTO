package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;
    private String NomMedico;
    private String ApeMedico;
    private String FechNacimiento;
}

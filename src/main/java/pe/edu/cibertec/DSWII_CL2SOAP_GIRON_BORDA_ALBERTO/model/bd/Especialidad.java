package pe.edu.cibertec.DSWII_CL2SOAP_GIRON_BORDA_ALBERTO.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {

 @Id

 private Integer IdEspecialidad;
 private String Titulo;
 private String Funcion;
 private String FechGraduacion;

 @ManyToOne
 @JoinColumn(name = "IdMedico")
 private Medico medico;

}

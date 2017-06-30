package Model.Entity;

import Model.Entity.Cabecerarecepcionmuestra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-30T15:17:21")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Short> edadpaciente;
    public static volatile SingularAttribute<Paciente, String> ceduidenpaciente;
    public static volatile SingularAttribute<Paciente, String> apellidopaciente;
    public static volatile SingularAttribute<Paciente, String> direccionpac;
    public static volatile SingularAttribute<Paciente, Integer> numhistclinpaciente;
    public static volatile SingularAttribute<Paciente, String> generopaciente;
    public static volatile ListAttribute<Paciente, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    public static volatile SingularAttribute<Paciente, Long> telefonopaciente;
    public static volatile SingularAttribute<Paciente, Integer> idpaciente;
    public static volatile SingularAttribute<Paciente, String> nombrepaciente;

}
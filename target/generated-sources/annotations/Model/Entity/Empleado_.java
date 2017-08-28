package Model.Entity;

import Model.Entity.Cargo;
import Model.Entity.Especialidad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-27T13:32:14")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> ceduidenempleado;
    public static volatile SingularAttribute<Empleado, Cargo> idcargo;
    public static volatile SingularAttribute<Empleado, Date> fechanacimiento;
    public static volatile SingularAttribute<Empleado, String> direccionempleado;
    public static volatile SingularAttribute<Empleado, String> generoempleado;
    public static volatile SingularAttribute<Empleado, Especialidad> idespecialidad;
    public static volatile SingularAttribute<Empleado, String> numtelempleado;
    public static volatile SingularAttribute<Empleado, String> apellidosempleado;
    public static volatile SingularAttribute<Empleado, Integer> idempleado;
    public static volatile SingularAttribute<Empleado, String> nombresempleado;

}
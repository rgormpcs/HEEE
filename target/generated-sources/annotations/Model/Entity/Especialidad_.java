package Model.Entity;

import Model.Entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-01T20:41:15")
@StaticMetamodel(Especialidad.class)
public class Especialidad_ { 

    public static volatile CollectionAttribute<Especialidad, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Especialidad, Integer> idespecialidad;
    public static volatile SingularAttribute<Especialidad, String> nombreespecialidad;

}
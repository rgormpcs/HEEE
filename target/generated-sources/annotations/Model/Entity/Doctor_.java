package Model.Entity;

import Model.Entity.Cabecerarecepcionmuestra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-29T14:21:16")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, Integer> iddoctor;
    public static volatile SingularAttribute<Doctor, String> emaildoctor;
    public static volatile SingularAttribute<Doctor, String> telefonodoctor;
    public static volatile SingularAttribute<Doctor, String> nombresdoctor;
    public static volatile SingularAttribute<Doctor, String> apellidosdoctor;
    public static volatile ListAttribute<Doctor, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;

}
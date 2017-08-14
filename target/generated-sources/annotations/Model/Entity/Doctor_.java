package Model.Entity;

import Model.Entity.Cabecerarecepcionmuestra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-12T13:37:24")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-07T17:51:51")
>>>>>>> 3be87db4238787d82de5d5dc3e2aab58eb018723
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile SingularAttribute<Doctor, Integer> iddoctor;
    public static volatile SingularAttribute<Doctor, String> emaildoctor;
    public static volatile SingularAttribute<Doctor, String> telefonodoctor;
    public static volatile SingularAttribute<Doctor, String> nombresdoctor;
    public static volatile SingularAttribute<Doctor, String> apellidosdoctor;
    public static volatile ListAttribute<Doctor, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;

}
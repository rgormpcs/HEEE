package Model.Entity;

import Model.Entity.Cabecerarecepcionmuestra;
import Model.Entity.Parroquia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-12T13:37:24")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-07T17:51:51")
>>>>>>> 3be87db4238787d82de5d5dc3e2aab58eb018723
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile SingularAttribute<Hospital, Integer> idhospital;
    public static volatile SingularAttribute<Hospital, String> unidadoperativa;
    public static volatile SingularAttribute<Hospital, Integer> codigouo;
    public static volatile ListAttribute<Hospital, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    public static volatile SingularAttribute<Hospital, String> instituciondelsistema;
    public static volatile SingularAttribute<Hospital, Parroquia> idparroquia;

}
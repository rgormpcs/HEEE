package Model.Entity;

import Model.Entity.Cabecerarecepcionmuestra;
import Model.Entity.Parroquia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-23T08:14:48")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-20T11:18:16")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-28T18:54:32")
>>>>>>> d93f5dfd221740eac018f3054e2dd04f5e1e6d89
>>>>>>> master
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile SingularAttribute<Hospital, Integer> idhospital;
    public static volatile SingularAttribute<Hospital, String> unidadoperativa;
    public static volatile SingularAttribute<Hospital, Integer> codigouo;
    public static volatile ListAttribute<Hospital, Cabecerarecepcionmuestra> cabecerarecepcionmuestraList;
    public static volatile SingularAttribute<Hospital, String> instituciondelsistema;
    public static volatile SingularAttribute<Hospital, Parroquia> idparroquia;

}
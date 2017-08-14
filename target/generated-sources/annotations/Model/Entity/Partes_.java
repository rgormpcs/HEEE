package Model.Entity;

import Model.Entity.Estudiosamputaciones;
import Model.Entity.Extremidades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-12T13:37:24")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-07T17:51:51")
>>>>>>> 3be87db4238787d82de5d5dc3e2aab58eb018723
@StaticMetamodel(Partes.class)
public class Partes_ { 

    public static volatile SingularAttribute<Partes, String> nombrepartes;
    public static volatile SingularAttribute<Partes, Integer> idpartes;
    public static volatile SingularAttribute<Partes, Extremidades> idextremidades;
    public static volatile ListAttribute<Partes, Estudiosamputaciones> estudiosamputacionesList;

}
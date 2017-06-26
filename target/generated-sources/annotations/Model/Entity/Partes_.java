package Model.Entity;

import Model.Entity.Estudiosamputaciones;
import Model.Entity.Extremidades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-20T11:18:16")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-28T18:54:32")
>>>>>>> d93f5dfd221740eac018f3054e2dd04f5e1e6d89
@StaticMetamodel(Partes.class)
public class Partes_ { 

    public static volatile SingularAttribute<Partes, String> nombrepartes;
    public static volatile SingularAttribute<Partes, Integer> idpartes;
    public static volatile SingularAttribute<Partes, Extremidades> idextremidades;
    public static volatile ListAttribute<Partes, Estudiosamputaciones> estudiosamputacionesList;

}
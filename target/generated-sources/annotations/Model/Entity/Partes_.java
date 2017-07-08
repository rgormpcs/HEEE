package Model.Entity;

import Model.Entity.Estudiosamputaciones;
import Model.Entity.Extremidades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-07-01T14:06:52")
@StaticMetamodel(Partes.class)
public class Partes_ { 

    public static volatile SingularAttribute<Partes, String> nombrepartes;
    public static volatile SingularAttribute<Partes, Integer> idpartes;
    public static volatile SingularAttribute<Partes, Extremidades> idextremidades;
    public static volatile ListAttribute<Partes, Estudiosamputaciones> estudiosamputacionesList;

}
package Model.Entity;

import Model.Entity.Contadorestipoestudioanio;
import Model.Entity.Detallerecepcionmuestra;
import Model.Entity.Marcador;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-10T11:45:51")
@StaticMetamodel(Tipoestudio.class)
public class Tipoestudio_ { 

    public static volatile ListAttribute<Tipoestudio, Detallerecepcionmuestra> detallerecepcionmuestraList;
    public static volatile SingularAttribute<Tipoestudio, String> nombrete;
    public static volatile ListAttribute<Tipoestudio, Marcador> marcadorList;
    public static volatile ListAttribute<Tipoestudio, Contadorestipoestudioanio> contadorestipoestudioanioList;
    public static volatile SingularAttribute<Tipoestudio, Integer> idte;

}
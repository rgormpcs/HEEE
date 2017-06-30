package Model.Entity;

import Model.Entity.Detalleestudioespecial;
import Model.Entity.Tipoestudio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-30T15:17:21")
@StaticMetamodel(Marcador.class)
public class Marcador_ { 

    public static volatile SingularAttribute<Marcador, String> descripcionmarcador;
    public static volatile ListAttribute<Marcador, Detalleestudioespecial> detalleestudioespecialList;
    public static volatile SingularAttribute<Marcador, Integer> idmarcador;
    public static volatile SingularAttribute<Marcador, Tipoestudio> idte;

}
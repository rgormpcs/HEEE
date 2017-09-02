package Model.Entity;

import Model.Entity.Organossistemas;
import Model.Entity.Subtipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-01T20:41:15")
@StaticMetamodel(Estudiosrevision.class)
public class Estudiosrevision_ { 

    public static volatile SingularAttribute<Estudiosrevision, Integer> numestudioer;
    public static volatile SingularAttribute<Estudiosrevision, Integer> iddetallerecepcionmuestraer;
    public static volatile SingularAttribute<Estudiosrevision, Integer> ider;
    public static volatile SingularAttribute<Estudiosrevision, String> descripcionsubtipoer;
    public static volatile SingularAttribute<Estudiosrevision, String> descripcionrevisioner;
    public static volatile SingularAttribute<Estudiosrevision, Subtipo> idsubtipo;
    public static volatile SingularAttribute<Estudiosrevision, Organossistemas> idos;

}
package Model.Entity;

import Model.Entity.Estudiosquirurgicos;
import Model.Entity.Estudiosrevision;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-12T13:37:24")
@StaticMetamodel(Subtipo.class)
public class Subtipo_ { 

    public static volatile ListAttribute<Subtipo, Estudiosrevision> estudiosrevisionList;
    public static volatile ListAttribute<Subtipo, Estudiosquirurgicos> estudiosquirurgicosList;
    public static volatile SingularAttribute<Subtipo, String> descripcionmarcadorsubtipo;
    public static volatile SingularAttribute<Subtipo, Integer> idsubtipo;

}
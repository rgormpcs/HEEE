package Model.Entity;

import Model.Entity.Estudiosquirurgicos;
import Model.Entity.Estudiosrevision;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-01T20:41:15")
@StaticMetamodel(Organossistemas.class)
public class Organossistemas_ { 

    public static volatile ListAttribute<Organossistemas, Estudiosrevision> estudiosrevisionList;
    public static volatile ListAttribute<Organossistemas, Estudiosquirurgicos> estudiosquirurgicosList;
    public static volatile SingularAttribute<Organossistemas, String> descripcionmarcadoros;
    public static volatile SingularAttribute<Organossistemas, Integer> idos;

}
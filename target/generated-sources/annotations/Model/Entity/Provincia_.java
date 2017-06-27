package Model.Entity;

import Model.Entity.Canton;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-26T23:17:44")
@StaticMetamodel(Provincia.class)
public class Provincia_ { 

    public static volatile ListAttribute<Provincia, Canton> cantonList;
    public static volatile SingularAttribute<Provincia, Integer> codprovincia;
    public static volatile SingularAttribute<Provincia, String> nombreprovincia;
    public static volatile SingularAttribute<Provincia, Integer> idprovincia;

}
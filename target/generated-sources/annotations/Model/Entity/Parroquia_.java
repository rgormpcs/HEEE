package Model.Entity;

import Model.Entity.Canton;
import Model.Entity.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-10T22:42:34")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-10T14:38:33")
>>>>>>> 98bdd879fce50babab846911c761232992bb14bc
@StaticMetamodel(Parroquia.class)
public class Parroquia_ { 

    public static volatile SingularAttribute<Parroquia, String> nombreparroquia;
    public static volatile ListAttribute<Parroquia, Hospital> hospitalList;
    public static volatile SingularAttribute<Parroquia, Canton> idcanton;
    public static volatile SingularAttribute<Parroquia, Integer> codparroquia;
    public static volatile SingularAttribute<Parroquia, Integer> idparroquia;

}
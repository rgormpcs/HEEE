package Model.Entity;

import Model.Entity.Parroquia;
import Model.Entity.Provincia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-10T22:42:34")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-10T14:38:33")
>>>>>>> 98bdd879fce50babab846911c761232992bb14bc
@StaticMetamodel(Canton.class)
public class Canton_ { 

    public static volatile SingularAttribute<Canton, String> nombrecanton;
    public static volatile ListAttribute<Canton, Parroquia> parroquiaList;
    public static volatile SingularAttribute<Canton, Integer> codcanton;
    public static volatile SingularAttribute<Canton, Integer> idcanton;
    public static volatile SingularAttribute<Canton, Provincia> idprovincia;

}
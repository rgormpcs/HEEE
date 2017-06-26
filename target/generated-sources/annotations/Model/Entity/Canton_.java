package Model.Entity;

import Model.Entity.Parroquia;
import Model.Entity.Provincia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-20T11:18:16")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-28T18:54:32")
>>>>>>> d93f5dfd221740eac018f3054e2dd04f5e1e6d89
@StaticMetamodel(Canton.class)
public class Canton_ { 

    public static volatile SingularAttribute<Canton, String> nombrecanton;
    public static volatile ListAttribute<Canton, Parroquia> parroquiaList;
    public static volatile SingularAttribute<Canton, Integer> codcanton;
    public static volatile SingularAttribute<Canton, Integer> idcanton;
    public static volatile SingularAttribute<Canton, Provincia> idprovincia;

}
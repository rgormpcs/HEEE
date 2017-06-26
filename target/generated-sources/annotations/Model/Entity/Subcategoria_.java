package Model.Entity;

import Model.Entity.Categoria;
import Model.Entity.Detalleestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-20T11:18:16")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-28T18:54:32")
>>>>>>> d93f5dfd221740eac018f3054e2dd04f5e1e6d89
@StaticMetamodel(Subcategoria.class)
public class Subcategoria_ { 

    public static volatile SingularAttribute<Subcategoria, String> nombreetiquetasubcategoria;
    public static volatile SingularAttribute<Subcategoria, Integer> idsubcategoria;
    public static volatile SingularAttribute<Subcategoria, String> nombresubcategoria;
    public static volatile SingularAttribute<Subcategoria, Categoria> idcategoria;
    public static volatile SingularAttribute<Subcategoria, String> tipodatosubcategoria;
    public static volatile ListAttribute<Subcategoria, Detalleestudiocitologico> detalleestudiocitologicoList;

}
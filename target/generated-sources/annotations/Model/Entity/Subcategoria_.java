package Model.Entity;

import Model.Entity.Categoria;
import Model.Entity.Detalleestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-12T13:37:24")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-07T17:51:51")
>>>>>>> 3be87db4238787d82de5d5dc3e2aab58eb018723
@StaticMetamodel(Subcategoria.class)
public class Subcategoria_ { 

    public static volatile SingularAttribute<Subcategoria, String> nombreetiquetasubcategoria;
    public static volatile SingularAttribute<Subcategoria, Integer> idsubcategoria;
    public static volatile SingularAttribute<Subcategoria, String> nombresubcategoria;
    public static volatile SingularAttribute<Subcategoria, Categoria> idcategoria;
    public static volatile SingularAttribute<Subcategoria, String> tipodatosubcategoria;
    public static volatile ListAttribute<Subcategoria, Detalleestudiocitologico> detalleestudiocitologicoList;

}
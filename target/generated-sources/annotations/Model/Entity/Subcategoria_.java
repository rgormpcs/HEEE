package Model.Entity;

import Model.Entity.Categoria;
import Model.Entity.Detalleestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-23T08:14:48")
@StaticMetamodel(Subcategoria.class)
public class Subcategoria_ { 

    public static volatile SingularAttribute<Subcategoria, String> nombreetiquetasubcategoria;
    public static volatile SingularAttribute<Subcategoria, Integer> idsubcategoria;
    public static volatile SingularAttribute<Subcategoria, String> nombresubcategoria;
    public static volatile SingularAttribute<Subcategoria, Categoria> idcategoria;
    public static volatile SingularAttribute<Subcategoria, String> tipodatosubcategoria;
    public static volatile ListAttribute<Subcategoria, Detalleestudiocitologico> detalleestudiocitologicoList;

}
package Model.Entity;

import Model.Entity.Categoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-10T11:45:51")
@StaticMetamodel(Tipoestudiocitologico.class)
public class Tipoestudiocitologico_ { 

    public static volatile SingularAttribute<Tipoestudiocitologico, Integer> idtec;
    public static volatile SingularAttribute<Tipoestudiocitologico, String> descripcionmarcadortec;
    public static volatile ListAttribute<Tipoestudiocitologico, Categoria> categoriaList;

}
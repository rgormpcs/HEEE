package Model.Entity;

import Model.Entity.Subcategoria;
import Model.Entity.Tipoestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-24T18:54:30")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Tipoestudiocitologico> idtec;
    public static volatile ListAttribute<Categoria, Subcategoria> subcategoriaList;
    public static volatile SingularAttribute<Categoria, String> descripcionmarcadorcategoria;
    public static volatile SingularAttribute<Categoria, Integer> idcategoria;

}
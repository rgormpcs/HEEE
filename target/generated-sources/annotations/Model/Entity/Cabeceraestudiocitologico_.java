package Model.Entity;

import Model.Entity.Detalleestudiocitologico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-16T16:52:33")
@StaticMetamodel(Cabeceraestudiocitologico.class)
public class Cabeceraestudiocitologico_ { 

    public static volatile SingularAttribute<Cabeceraestudiocitologico, Integer> idcec;
    public static volatile SingularAttribute<Cabeceraestudiocitologico, String> descripcioncitologicocec;
    public static volatile SingularAttribute<Cabeceraestudiocitologico, Integer> numestudiocec;
    public static volatile SingularAttribute<Cabeceraestudiocitologico, Integer> iddetallerecepcionmuestracec;
    public static volatile ListAttribute<Cabeceraestudiocitologico, Detalleestudiocitologico> detalleestudiocitologicoList;

}
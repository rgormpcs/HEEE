package Model.Entity;

import Model.Entity.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-16T15:27:15")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> nombremenu;
    public static volatile SingularAttribute<Menu, Integer> codigomenu;
    public static volatile ListAttribute<Menu, Menu> menuList;
    public static volatile SingularAttribute<Menu, String> tipousuariomenu;
    public static volatile SingularAttribute<Menu, Boolean> estadomenu;
    public static volatile SingularAttribute<Menu, String> tipomenu;
    public static volatile SingularAttribute<Menu, String> urlmenu;
    public static volatile SingularAttribute<Menu, Menu> codigosubmenu;

}
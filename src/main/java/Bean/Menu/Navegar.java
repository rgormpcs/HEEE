package Bean.Menu;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "navegar")
@SessionScoped
public class Navegar implements Serializable {

    private static final long serialVersionUID = 1L;

    /*Método para direccionar a la Página principal*/
    public static void direccionarInicio() {
        try {
            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");
        } catch (Exception e) {
            System.out.println("FALLO LA REDIRECCION A UN NUEVO FORMULARIO");
            e.printStackTrace();
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    
    
}

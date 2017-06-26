package Model.Entity;

import Model.Entity.Detallerecepcionmuestra;
import Model.Entity.Doctor;
import Model.Entity.Hospital;
import Model.Entity.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-23T08:14:48")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-20T11:18:16")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-05-28T18:54:32")
>>>>>>> d93f5dfd221740eac018f3054e2dd04f5e1e6d89
>>>>>>> master
@StaticMetamodel(Cabecerarecepcionmuestra.class)
public class Cabecerarecepcionmuestra_ { 

    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> numplacascrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechacreacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Doctor> iddoctor;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> usuariocreacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> tratamientopacientecrm;
    public static volatile ListAttribute<Cabecerarecepcionmuestra, Detallerecepcionmuestra> detallerecepcionmuestraList;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> tiposervicio;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> numbloquescrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Paciente> idpaciente;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> prioridad;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> diagnosticopresunticocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> camacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Hospital> idhospital;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> idcrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> usuarioactualizacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> tempambientemuestra;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> serviciocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> descriptiposerviciocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> muestrapiezacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> horatomamuestracrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> salacrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechatomamuestracrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Integer> refrigeracionmuestra;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, String> resumenclinicocrm;
    public static volatile SingularAttribute<Cabecerarecepcionmuestra, Date> fechaactualizacrm;

}
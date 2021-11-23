package pe.edu.uandina.ProjectBeerTime.modelos;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "dniUsuario")
    private String dniUsuario;
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    @Column(name = "ApellidoUsuario")
    private String apellidoUsuario;
    @Column(name = "Usuario")
    private String usuario;
    @Column(name = "Contraseña")
    private String contraseña;
    @Column(name = "Celular")
    private String celular;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Direccion")
    private String direccion;
    @OneToMany(mappedBy = "tieneUsuario")
    private List<Reserva> reservas

    public Usuario() {
    }

    public Usuario(long id, String dniUsuario, String nombreUsuario, String apellidoUsuario, String usuario, String contraseña, String celular, String correo, String direccion, List<Reserva> reservas) {
        this.id = id;
        this.dniUsuario = dniUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.reservas = reservas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        apellidoUsuario = apellidoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        contraseña = contraseña;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        direccion = direccion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}


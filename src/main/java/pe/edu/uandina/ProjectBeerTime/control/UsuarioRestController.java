package pe.edu.uandina.ProjectBeerTime.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.ProjectBeerTime.modelos.Servicies.IUsuarioService;
import pe.edu.uandina.ProjectBeerTime.modelos.Usuario;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> listar(){
        return  usuarioService.findAll();
    }

    @GetMapping("/local/{id}")
    public Usuario mostrar(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/local")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crear(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/local/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Usuario actualizar(@RequestBody Usuario usuario,@PathVariable Long id){
        Usuario usuario1 = usuarioService.findById(id);
        usuario1.setUsuario(usuario.getUsuario());
        usuario1.setNombreUsuario(usuario.getNombreUsuario());
        usuario1.setApellidoUsuario(usuario.getApellidoUsuario());
        usuario1.setDniUsuario(usuario.getDniUsuario());
        usuario1.setCelular(usuario.getContraseña());
        usuario1.setContraseña(usuario.getContraseña());
        usuario1.setCorreo(usuario.getCorreo());
        usuario1.setDireccion(usuario.getDireccion());
        usuario1.setReservas(usuario.getReservas());
        return usuarioService.save(usuario1);
    }

    @DeleteMapping("/local/{id}")
    public void eliminar(@PathVariable Long id){
        usuarioService.delete(id);
    }
}

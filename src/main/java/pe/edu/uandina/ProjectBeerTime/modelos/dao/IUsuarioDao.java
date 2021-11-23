package pe.edu.uandina.ProjectBeerTime.modelos.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.ProjectBeerTime.modelos.Usuario;

import java.util.List;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}

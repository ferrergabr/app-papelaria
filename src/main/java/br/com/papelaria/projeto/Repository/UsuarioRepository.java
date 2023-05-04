package br.com.papelaria.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}

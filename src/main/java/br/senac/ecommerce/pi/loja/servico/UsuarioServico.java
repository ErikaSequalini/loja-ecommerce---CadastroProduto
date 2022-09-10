package br.senac.ecommerce.pi.loja.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.ecommerce.pi.loja.modelo.UsuarioModelo;
import br.senac.ecommerce.pi.loja.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	public List<UsuarioModelo> listarTodosUsuarios(){
		return this.usuarioRepositorio.findAll();
	}

}
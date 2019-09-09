package br.com.bandtec.AgendaDeObjetivos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuariosController {

	private List<Usuario> usuarios;
	
	public UsuariosController() {
		this.usuarios = obterTodosUsuarios();
	}
	
	@GetMapping("/usuarios/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nomeProcurado){
		
		List<Usuario> usuariosPorNome = new ArrayList<>();
		
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nomeProcurado)) {
				usuariosPorNome.add(usuario);
			}
		}
		
		if (usuariosPorNome.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(usuariosPorNome);
	}
	
	@GetMapping("/usuarios/idade/{idadeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorIdade(@PathVariable("idadeDoUsuario") Integer idadeProcurada){
		
		List<Usuario> usuariosPorIdade = new ArrayList<>();
		
		for (Usuario usuario : usuarios) {
			if (usuario.getIdade() == idadeProcurada) {
				usuariosPorIdade.add(usuario);
			}
		}
		
		if (usuariosPorIdade.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(usuariosPorIdade);
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario novoUsuario){
		if (!Usuario.isUsuarioValido(novoUsuario)) {
			System.out.println("erro no cadastro");
			return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(novoUsuario);
		}
		
		usuarios.add(novoUsuario);
		return ResponseEntity.ok(novoUsuario);
	}
	
	private List<Usuario> obterTodosUsuarios(){
		List<Usuario> usuariosTemp = new ArrayList<Usuario>();
		usuariosTemp.add(new Usuario("tiago", 36));
		usuariosTemp.add(new Usuario("tiago", 30));
		usuariosTemp.add(new Usuario("pedro", 18));
		usuariosTemp.add(new Usuario("maria", 16));
		
		return usuariosTemp;
		
//		return Arrays.asList(
//					new Usuario("tiago", 36),
//					new Usuario("tiago", 30),
//					new Usuario("pedro", 18),
//					new Usuario("maria", 18)
//				);
	}
	
}

package br.ifpe.edu.br.Atv01;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {
	@GetMapping("/cad_cliente")
	public String exibirTelaCliente() {
		return "cliente";
	}
	@GetMapping("/cad_fornecedor")
	public String exibirTelaFornecedor() {
		return "fornecedor";
	}
	@PostMapping("/salvar_cliente")
	public String SalvarCliente(Cliente cliente) {
		System.out.println("Cliente: " + cliente.getNome() + " - " + 
				cliente.getTelefone() + " - " + cliente.getEmail());
		return "index";
	}
	@PostMapping("/salvar_fornecedor")
	public String SalvarFornecedor(Fornecedor fornecedor) {
		System.out.println("Fornecedor - " + fornecedor.getNome() + " - " + 
				fornecedor.getCnpj() + " - " + fornecedor.getTelefone());
		return "index";
	}
	
}

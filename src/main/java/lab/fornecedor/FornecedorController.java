package lab.fornecedor;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	  @Autowired
	  private FornecedorService fornecedorService;
	  
	  @RequestMapping(value = "/consultar", method = GET)
	  public Fornecedor consultar(@RequestParam Integer codigo) {
	    return fornecedorService.obterFornecedor(codigo);
	  }

	  @RequestMapping("/listar")
	  public Iterable<Fornecedor> listar() {
	    return fornecedorService.obterTodos();
	  }

	  @RequestMapping(value = "/novo", method = POST)
	  public Fornecedor novo(@RequestBody Fornecedor fornecedor) {
	    return fornecedorService.registrarFornecedor(fornecedor);
	  }

}

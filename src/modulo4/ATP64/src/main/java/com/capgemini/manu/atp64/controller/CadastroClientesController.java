
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import repository.CadastroClienteRepository;

@Controller
public class CadastroClienteController(){
    
    @GetMapping("/cadastroCliente")
    public String filmes(Model req){
        List<cadastroCliente> lista = (List<CadastroCliente>)repository.findAll();
        req.addAttribute("filmes", lista);
        return "filmes";

    }

    @GetMapping("/CadastroCliente/form")
    public String formulario(Model req){
        CadastroCliente model = new CadastroCliente();
        req.addAttribute("cadastro", model);
        return "CadastroCliente-form";
    }

	@PostMapping public String salvar(CadastroClinete model){
        Repository.save(model);
        return "redirect:/CadastroCliente";
    }

    @GetMapping("/CadastroCliente/deletar/{id}")
    public String deletar(@PathVariable int id){
        Repository.deleteById(id);
        return "redirect:/CadastroCliente";
    }

    @GetMapping("/CadastroCliente/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        CadastroCliente model = Repository.findById(id).get();
        req.addAttribute("CadastroCliente", model);
        return "CadastroCliente-form";
    }
}
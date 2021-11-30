import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
	public FilmeController(FilmeRepository repository) {
    }

    @GetMapping("/model/Filme")
    public String filmes(Model req){
        List<Filme> lista = (List<Filme>)repository.findAll();
        req.addAttribute("Filmes", lista);
        return "filmes";

    }

    @GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();
        req.addAttribute("filme", model);
        return "filmes-form";
    }

	@PostMapping("/filme/salvar")
    public String salvar(@RequestBody Filme model){
        repository.save(model);
        return "redirect:/filme";
    }
    

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = repository.findById(id).get();
        req.addAttribute("filme", model);
        return "filmes-form";
    }
    @PostMapping("/api/filme/{id}")
    public String update(@RequestBody Filme model, @PathVariable int id){
        if(model.getId() == id){
        repository.save(model);
        return "redirect:/filme";
        }
    return "id da url diferente do body";
    }
}
package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class App {
    @Autowired
    ISaludadores iSaludadores;

    @RequestMapping(value = "/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> obtenerSaludos(){
        return iSaludadores.findAll();

    }
    
    @RequestMapping(value = "/saludos", method = RequestMethod.POST)
    public void crearSaludos(@RequestBody Saludadores saludadores){
        iSaludadores.save(saludadores);
    }
}

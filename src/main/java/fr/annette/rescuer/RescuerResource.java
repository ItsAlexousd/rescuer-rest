package fr.annette.rescuer;

import fr.annette.rescuer.model.Rescuer;
import fr.annette.rescuer.service.RescuerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rescuer")
public class RescuerResource {
    private final RescuerService rescuerService;

    public RescuerResource(RescuerService rescuerService) {
        this.rescuerService = rescuerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rescuer>> getAllRescuers(){
        List<Rescuer> rescuers = rescuerService.findAllRescuers();
        return new ResponseEntity<>(rescuers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Rescuer> getRescuerById(@PathVariable("id") Long id){
        Rescuer rescuer = rescuerService.findRescuerById(id);
        return new ResponseEntity<>(rescuer, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Rescuer> addRescuer(@RequestBody Rescuer rescuer){
        Rescuer newRescuer = rescuerService.addRescuer(rescuer);
        return new ResponseEntity<>(newRescuer, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Rescuer> updateRescuer(@RequestBody Rescuer rescuer){
        Rescuer updateRescuer = rescuerService.updateRescuer(rescuer);
        return new ResponseEntity<>(updateRescuer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRescuer(@PathVariable("id") Long id){
        rescuerService.deleteRescuer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
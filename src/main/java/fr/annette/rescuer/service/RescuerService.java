package fr.annette.rescuer.service;

import fr.annette.rescuer.exception.RescuerNotFoundException;
import fr.annette.rescuer.model.Rescuer;
import fr.annette.rescuer.repo.RescuerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RescuerService {
    private final RescuerRepo rescuerRepo;

    @Autowired
    public RescuerService(RescuerRepo rescuerRepo) {
        this.rescuerRepo = rescuerRepo;
    }

    public Rescuer addRescuer(Rescuer rescuer){
        return rescuerRepo.save(rescuer);
    }

    public List<Rescuer> findAllRescuers(){
        return rescuerRepo.findAll();
    }

    public Rescuer updateRescuer(Rescuer rescuer){
        return rescuerRepo.save(rescuer);
    }

    public Rescuer findRescuerById(Long id){
        return rescuerRepo.findRescuerById(id)
                .orElseThrow(() -> new RescuerNotFoundException("Rescuer by id " + id + " was not found"));
    }

    public void deleteRescuer(Long id){
        rescuerRepo.deleteRescuerById(id);
    }
}
package com.neosoft.SpringBootPagination.Controllers;


import com.neosoft.SpringBootPagination.Entities.Zwigato;
import com.neosoft.SpringBootPagination.Services.ZwigatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ZwigatoController {

    @Autowired
    private ZwigatoService zwigatoService;

    @PostMapping("/save")
    public Zwigato saveZwigato(@RequestBody Zwigato zwigato){
        return zwigatoService.saveZwigato(zwigato);
    }


    @GetMapping("/get/{id}")
    public Zwigato getZwigato(@PathVariable int id){
        return zwigatoService.getZwigato(id);
    }

    @PutMapping("/update")
    public Zwigato updateZwigato(@RequestBody Zwigato zwigato){
        return zwigatoService.updateZwigato(zwigato);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteZwigato(@PathVariable int id){
        zwigatoService.deleteZwigato(id);
        return "Deleted Successfully!";
    }

    @GetMapping("/getall")
    public List<Zwigato> getAllZwigato() {
        return zwigatoService.getALLZwigato();
    }


//    get info with paging
    @GetMapping("/getallwithPaging")
    public List<Zwigato> getAllZwigato_Paging(@RequestParam(defaultValue = "0") int pageNo,
                                              @RequestParam(defaultValue = "3") int pageSize){
        return  zwigatoService.getAllZwigato_Paging(pageNo,pageSize);
    }

}

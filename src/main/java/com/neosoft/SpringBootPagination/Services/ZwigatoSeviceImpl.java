package com.neosoft.SpringBootPagination.Services;

import com.neosoft.SpringBootPagination.Entities.Zwigato;
import com.neosoft.SpringBootPagination.Repositories.ZwigatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZwigatoSeviceImpl implements ZwigatoService {


    @Autowired
    private ZwigatoRepository zwigatoRepository;

    @Override
    public Zwigato saveZwigato(Zwigato zwigato) {
        return zwigatoRepository.save(zwigato);
    }

    @Override
    public Zwigato getZwigato(int id) {
        Zwigato zwigato = zwigatoRepository.findById(id);
        return zwigato;
    }


    @Override
    public Zwigato updateZwigato(Zwigato zwigato) {
        return zwigatoRepository.save(zwigato);
    }

    @Override
    public void deleteZwigato(int id) {
        zwigatoRepository.deleteById(id);

    }

    @Override
    public List<Zwigato> getALLZwigato() {
        return zwigatoRepository.findAll();
    }
}

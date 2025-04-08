package com.neosoft.SpringBootPagination.Services;

import com.neosoft.SpringBootPagination.Entities.Zwigato;

import java.util.List;

public interface ZwigatoService {

    //save
    public Zwigato saveZwigato(Zwigato zwigato);

    // get
    public Zwigato getZwigato(int id);

    // update
    public Zwigato updateZwigato(Zwigato zwigato);

    //delete
    public void deleteZwigato(int id);

    //getall
    public List<Zwigato> getALLZwigato();

    //getAllZwigato with paging
    public List<Zwigato> getAllZwigato_Paging(int pageNo, int pageSize);
}

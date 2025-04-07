package com.neosoft.SpringBootPagination.Repositories;

import com.neosoft.SpringBootPagination.Entities.Zwigato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZwigatoRepository extends JpaRepository<Zwigato, Integer> {
    public Zwigato findById(int id);

    public  void deleteById(int id);

}

package com.Examen.Final.DTO;

import com.Examen.Final.DAO.CursosDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursosDAO, Long>{

}

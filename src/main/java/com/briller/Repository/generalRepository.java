package com.briller.Repository;

import com.briller.Model.general;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface generalRepository extends JpaRepository<general,Integer> {

    List<general> findAll();
}

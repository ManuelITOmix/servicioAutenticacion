
package com.servCrud.service.repo;

import com.servCrud.service.entity.Autenticacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Autrepo extends JpaRepository<Autenticacion, Integer> {

}

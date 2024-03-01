package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer>{

}

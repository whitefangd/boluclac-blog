package com.boluclac.blog.database.repositories.base;

import com.boluclac.blog.database.entities.LnkUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 06/11/2018
*/
@Repository
public interface LnkUserRoleBaseRepository extends JpaRepository<LnkUserRole, Integer>, JpaSpecificationExecutor<LnkUserRole> {

}

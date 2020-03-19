package com.gjg.respositories;

import com.gjg.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Integer>,RoleCustomRepository {

}

package com.gjg.respositories;

import com.gjg.models.Role;
import com.gjg.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleCustomRepository {

    @Query("SELECT r FROM Role r WHERE r.role = :role")
    Role findRoleByName(@Param("role") String role);

}

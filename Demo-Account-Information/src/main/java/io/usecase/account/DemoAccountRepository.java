package io.usecase.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DemoAccountRepository extends JpaRepository<DemoAccountModel, String>{

	

}

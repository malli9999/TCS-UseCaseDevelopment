package io.usecase.transaction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.usecase.rewards.DemoRewardsModel;


@Repository
public interface DemoTransactionRepository extends JpaRepository<DemoTransactionModel, String>{

	

}

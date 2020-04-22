package io.usecase.rewards;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRewardsRepository  extends JpaRepository<DemoRewardsModel, String> {
	

}

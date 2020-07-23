package com.sunil__parcha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sunil__parcha.Modals.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer>{

}

package com.revature.SynergyFitness.data;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.SynergyFitness.Beans.UserComments;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepository extends JpaRepository<UserComments,Integer>{

}

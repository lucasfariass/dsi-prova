package br.unifacisa.si.questao3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
	Payment findByRequester(String requester);
	

}

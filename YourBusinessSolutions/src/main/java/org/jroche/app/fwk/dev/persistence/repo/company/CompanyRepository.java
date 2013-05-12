package org.jroche.app.fwk.dev.persistence.repo.company;

import org.jroche.app.fwk.dev.persistence.model.user.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface CompanyRepository extends JpaRepository<Company, Long>,
		QueryDslPredicateExecutor<Company> {

	Company findByCompanyName(String companyName);

	Page<Company> findByCompanyNameLike(String companyName, Pageable pageable);

	Page<Company> findByCompanyIdLike(String companyId, Pageable pageable);

}

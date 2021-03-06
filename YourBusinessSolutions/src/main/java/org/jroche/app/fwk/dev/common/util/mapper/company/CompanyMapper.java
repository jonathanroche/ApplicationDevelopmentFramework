package org.jroche.app.fwk.dev.common.util.mapper.company;

import java.util.ArrayList;
import java.util.List;

import org.jroche.app.fwk.dev.persistence.model.user.Company;
import org.jroche.app.fwk.dev.web.model.user.CompanyUI;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CompanyMapper {

	public CompanyUI toUIBean(Company company) {
		CompanyUI uiBean = null;

		if (company != null) {
			uiBean = new CompanyUI();
			uiBean.setCompanyName(company.getCompanyName());
			uiBean.setId(company.getId());
			uiBean.setCompanyId(company.getCompanyId());
			uiBean.setPassword(company.getPassword());
			uiBean.setCompanyAddress(company.getCompanyAddress());
			uiBean.setCreateadBy(company.getCreateadBy());
			uiBean.setCreatedDate(company.getCreatedDate());
			uiBean.setDescription(company.getDescription());
			uiBean.setEmail(company.getEmail());
			uiBean.setLastLoggedIn(company.getLastLoggedIn());
			uiBean.setCompanyPhone(company.getCompanyPhone());
			uiBean.setModifiedBy(company.getModifiedBy());
			uiBean.setModifiedDate(company.getModifiedDate());
			uiBean.setNotes(company.getNotes());
		}

		return uiBean;
	}

	public List<CompanyUI> toUIBean(List<Company> companys) {
		List<CompanyUI> uiBeans = new ArrayList<CompanyUI>();

		for (Company company : companys) {
			uiBeans.add(toUIBean(company));
		}
		return uiBeans;
	}

	public Page<CompanyUI> toUIBean(Page<Company> companys, Pageable pageable) {
		Page<CompanyUI> uiBeans = new PageImpl<CompanyUI>(
				toUIBean(companys.getContent()), pageable,
				companys.getTotalElements());

		return uiBeans;
	}

	public Company toPersistenceBean(CompanyUI uiBean) {
		Company company = null;

		if (uiBean != null) {
			company = new Company();
			company.setCompanyName(uiBean.getCompanyName());
			company.setId(uiBean.getId());
			company.setCompanyId(uiBean.getCompanyId());
			company.setPassword(uiBean.getPassword());
			company.setCompanyAddress(uiBean.getCompanyAddress());
			company.setCreateadBy(uiBean.getCreateadBy());
			company.setCreatedDate(uiBean.getCreatedDate());
			company.setDescription(uiBean.getDescription());
			company.setEmail(uiBean.getEmail());
			company.setLastLoggedIn(uiBean.getLastLoggedIn());
			company.setCompanyPhone(uiBean.getCompanyPhone());
			company.setModifiedBy(uiBean.getModifiedBy());
			company.setModifiedDate(uiBean.getModifiedDate());
			company.setNotes(uiBean.getNotes());
		}
		return company;
	}

	public List<Company> toPersistenceBean(List<CompanyUI> uiBeans) {
		List<Company> companys = new ArrayList<Company>();

		for (CompanyUI uiBean : uiBeans) {
			companys.add(toPersistenceBean(uiBean));
		}
		return companys;
	}

}

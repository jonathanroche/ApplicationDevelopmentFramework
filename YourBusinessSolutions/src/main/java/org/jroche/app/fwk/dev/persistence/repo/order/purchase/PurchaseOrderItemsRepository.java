package org.jroche.app.fwk.dev.persistence.repo.order.purchase;

import java.util.List;

import org.jroche.app.fwk.dev.persistence.model.order.purchase.PurchaseOrder;
import org.jroche.app.fwk.dev.persistence.model.order.purchase.PurchaseOrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PurchaseOrderItemsRepository extends
		JpaRepository<PurchaseOrderItems, Long>,
		QueryDslPredicateExecutor<PurchaseOrderItems> {
	
	public List<PurchaseOrderItems> findByPo(PurchaseOrder po);
}

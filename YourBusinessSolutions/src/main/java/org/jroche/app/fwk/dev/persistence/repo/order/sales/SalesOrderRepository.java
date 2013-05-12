package org.jroche.app.fwk.dev.persistence.repo.order.sales;

import org.jroche.app.fwk.dev.persistence.model.order.sales.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long>,
		QueryDslPredicateExecutor<SalesOrder> {

	public SalesOrder findByOrderId(String orderId);
}

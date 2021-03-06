package com.example.demo.service.order;

import com.example.demo.model.Orderprod;
import com.example.demo.repository.order.OrderprodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrderprodServiceImpl implements OrderprodService {

	@Autowired
	OrderprodDao orderprodDao;

	@Override
	public  List<Orderprod> getOrderprodList(int order_no){

		List<Orderprod> orderprodList  = orderprodDao.findByOrder_no(order_no);
		return orderprodList;
	}

	@Override
	public void insertOrderprod(Orderprod orderprod){
		orderprodDao.insertOrderprod(orderprod);
	}

	@Override
	public void updateOrderprod(Orderprod orderprod){
		orderprodDao.updateOrderprod(orderprod);
	}

	@Override
	public void deleteOrderprods(int order_no){
		orderprodDao.deleteOrderprodByOrder_no(order_no);
	}

}

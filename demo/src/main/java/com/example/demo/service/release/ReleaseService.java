package com.example.demo.service.release;

import java.util.List;

import com.example.demo.model.Stock;

public interface ReleaseService {
	List<Stock> getStockList(String acnt_store_no);
}

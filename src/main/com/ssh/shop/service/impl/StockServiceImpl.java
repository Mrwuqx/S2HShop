package main.com.ssh.shop.service.impl;

import main.com.ssh.shop.entity.Stock;
import main.com.ssh.shop.service.StockService;
import org.springframework.stereotype.Service;

@Service("stockService")
public class StockServiceImpl extends BaseServiceImpl<Stock> implements StockService {
}

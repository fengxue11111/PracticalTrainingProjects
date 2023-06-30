package com.freecoder.service.impl;


import com.freecoder.mapper.AdminAcceptMapper;
import com.freecoder.pojo.Order;
import com.freecoder.pojo.OrderItem;
import com.freecoder.service.AdminAcceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminAcceptServiceImpl implements AdminAcceptService {
    @Autowired
    private AdminAcceptMapper adminAcceptMapper;
    @Override
    public Integer getTableID(String restID,String tableName,String tableType){return adminAcceptMapper.getTableID(restID,tableName,tableType);}

    public Integer getOrderingID(Integer tableID){return adminAcceptMapper.getOrderingID(tableID);}

    public List<Order> getPendingList(String restID){return adminAcceptMapper.getPendingList(restID);}

    public Order getPendingOrder(Integer orderID){return adminAcceptMapper.getPendingOrder(orderID);}

    public List<OrderItem> getPendingItem(Integer orderID){return adminAcceptMapper.getPendingItem(orderID);}

    public void acceptOrder(Integer orderID){adminAcceptMapper.acceptOrder(orderID);}
}

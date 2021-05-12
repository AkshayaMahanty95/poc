package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {



}

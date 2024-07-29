package com.KBPS.KBPS.CRUD.Template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.KBPS.KBPS.CRUD.Template.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

package com.example.springintegration.repository;

import com.example.springintegration.model.MyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRecordRepository extends JpaRepository<MyRecord, Long> {
}

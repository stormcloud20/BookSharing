package com.booksharing.apisystem.repository;

import com.booksharing.apisystem.model.Book;
import com.booksharing.apisystem.model.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThreadRepository extends JpaRepository<Thread, Integer> {
    @Query("SELECT r FROM Thread r WHERE r.buyerid = %:userId% OR r.sellerid = %:userId%")
    public List<Thread> findPossibleThreads(@Param("userId") Long userId);
}

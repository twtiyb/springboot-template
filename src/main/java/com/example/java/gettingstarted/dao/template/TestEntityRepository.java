package com.example.java.gettingstarted.dao.template;

import com.example.java.gettingstarted.entity.template.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xuchun on 2017/5/17.
 */
@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, String> {

}

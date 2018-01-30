package com.example.java.gettingstarted.service.imp;

import com.example.java.gettingstarted.dao.template.TestEntityRepository;
import com.example.java.gettingstarted.entity.template.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xuchun on 2018/1/30.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEntityServiceImpTest {
	@Resource
	TestEntityRepository testEntityRepository;
	@Test
	public void testIns() throws Exception {
		testEntityRepository.deleteAll();

		TestEntity testEntity = new TestEntity();
		testEntity.setId("1");
		testEntity.setName("test");
		testEntityRepository.save(testEntity);
	}

	@Test
	public void testFind() throws Exception {
		testEntityRepository.findAll().forEach(testEntity -> System.out.println(testEntity.toString()));
	}
}
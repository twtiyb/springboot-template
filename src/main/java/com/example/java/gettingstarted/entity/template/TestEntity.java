package com.example.java.gettingstarted.entity.template;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xuchun on 2017/7/1.
 */
@Data
@Entity
public class TestEntity {
	@Id
	String id;
	String name;

}

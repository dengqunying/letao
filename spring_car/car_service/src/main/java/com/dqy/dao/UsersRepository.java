package com.dqy.dao;
import com.dqy.api.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 参数一 T :当前需要映射的实体
 * 参数二 ID :当前映射的实体中的OID的类型 （对象的一个标识）
 *
 */
public interface UsersRepository extends JpaRepository<Car,Integer> {
   List<Car> findByNameEndingWith(String name);


}

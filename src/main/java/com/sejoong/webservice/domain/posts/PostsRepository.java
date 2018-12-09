package com.sejoong.webservice.domain.posts;


import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostsRepository extends JpaRepository<Posts, Long> {

	@Query("select p from Posts p order by p.id desc")
	Stream<Posts> findAllDesc(); 

}

package org.mrstm.springboot.bookStoreJPALearning;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

package com.Libraryms.LibraryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Libraryms.LibraryEntity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

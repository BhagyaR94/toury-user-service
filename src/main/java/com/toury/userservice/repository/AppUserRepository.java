package com.toury.userservice.repository;

import com.toury.userservice.documents.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AppUserRepository extends MongoRepository<AppUser, String> {
    @Query("userName:'?0'")
    AppUser findItemByName(String userName);

//    @Query(value = "{category:'?0'}", fields = "{'userName' : 1, 'quantity' : 1}")
//    List<AppUser> findAll(String category);

    public long count();

}

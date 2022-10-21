package ro.bogdanenache.demodocker.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  DemoRepository extends MongoRepository<DemoDocument, String> {

}

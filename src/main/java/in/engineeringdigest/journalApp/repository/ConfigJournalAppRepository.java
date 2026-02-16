package in.engineeringdigest.journalApp.repository;

import in.engineeringdigest.journalApp.entity.ConfigJournalAppEntity;
import in.engineeringdigest.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}

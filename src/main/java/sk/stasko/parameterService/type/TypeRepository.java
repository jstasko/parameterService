package sk.stasko.parameterService.type;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeRepository extends MongoRepository<TypeDto, String> {
}

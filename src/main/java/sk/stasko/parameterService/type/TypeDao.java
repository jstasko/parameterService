package sk.stasko.parameterService.type;

import java.util.List;

public interface TypeDao {
    Type save(Type type);
    List<Type> findAll();
}

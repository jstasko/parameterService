package sk.stasko.parameterService.type;

import java.util.List;

public interface TypeService {
    Type save(Type type);
    List<Type> findAll();
}

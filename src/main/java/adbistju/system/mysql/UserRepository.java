package adbistju.system.mysql;

import adbistju.system.obj.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
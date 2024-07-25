package hello.shop_crud.domain.user.repository;

import hello.shop_crud.domain.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserId(String userid);
    Optional<UserEntity> findByEmail(String email);
}

package seven.winds.studio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seven.winds.studio.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

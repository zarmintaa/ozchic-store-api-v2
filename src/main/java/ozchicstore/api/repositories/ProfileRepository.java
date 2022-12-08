package ozchicstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ozchicstore.api.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

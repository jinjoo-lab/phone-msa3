package phone.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "emails", path = "emails")
public interface EmailRepository
    extends PagingAndSortingRepository<Email, Long> {}

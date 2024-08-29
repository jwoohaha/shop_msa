package shopt.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopt.domain.*;

@RepositoryRestResource(collectionResourceRel = "views", path = "views")
public interface ViewRepository
    extends PagingAndSortingRepository<View, Long> {}

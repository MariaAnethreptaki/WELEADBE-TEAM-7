package gr.athtech.mapper;

import org.springframework.integration.annotation.Default;

import java.util.List;
import java.util.Set;

public interface BaseMapper<D,R> {

   @Default
   R toResource(D domain);
    List<R> toResources(List<D> domains);
    Set<R> toResources(Set<D> domains);

    @Default
    D toDomain(R resource);
    List<D> toDomains(List<R> resource);
    String map(D value);


}

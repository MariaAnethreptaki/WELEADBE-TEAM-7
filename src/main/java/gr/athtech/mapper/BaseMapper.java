package gr.athtech.mapper;


import java.util.List;
import java.util.Set;

public interface BaseMapper<D,R> {

   R toResource(D domain);
    List<R> toResources(List<D> domains);
    Set<R> toResources(Set<D> domains);
    D toDomain(R resource);
    List<D> toDomains(List<R> resource);
    String map(D value);


}

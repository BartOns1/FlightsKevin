package be.vdab.flights.repo;


import be.vdab.flights.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    //    @PersistenceContext
//    private EntityManager em;

//    public Passenger readById(int id) {
//        return em.find(Passenger.class, id);
//    }
//
//    public void update(Passenger p) {
//        em.merge(p);
//    }
//
//    public void deleteById(int id) {
////        Passenger p = em.find(Passenger.class, id);
//        Passenger p = em.getReference(Passenger.class, id);
//        em.remove(p);
//    }
//
//    public void save(Passenger p) {
//        em.persist(p);
//    }
//
//    public List<Passenger> findAll() {
//        return em.createQuery("select p from Passenger p",
//                Passenger.class).getResultList();
//    }
}

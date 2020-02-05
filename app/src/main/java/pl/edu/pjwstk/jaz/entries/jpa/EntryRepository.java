package pl.edu.pjwstk.jaz.entries.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class EntryRepository {
    @PersistenceContext
    EntityManager em;

    public Optional<Entry> findEntryById(Long entryId) {
        var entry = em.find(Entry.class, entryId);
        return Optional.ofNullable(entry);
    }

    @Transactional
    public Entry save(Entry entry) {
        if (entry.getId() == null) {
            em.persist(entry);
        } else {
            entry = em.merge(entry);
        }
        return entry;
    }

    public List<Entry> findAll() {
        return em.createQuery("FROM Entry ORDER BY Id DESC", Entry.class).getResultList();
    }
}

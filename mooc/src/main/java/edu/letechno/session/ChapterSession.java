package edu.letechno.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.letechno.entity.Chapter;

/**
 * Session Bean implementation class ChapterSession
 */
@Stateless
@SuppressWarnings("unchecked")
public class ChapterSession implements IChapterSession{

	@PersistenceContext
	private EntityManager em; 
	
    public ChapterSession() {
     
    }

	@Override
	public Chapter AddChapter(Chapter e) {
		em.persist(e);
		return e;
	}

	@Override
	public void DeleteChapter(Chapter e) {
		em.remove(e);
		
	}

	@Override
	public Chapter UpdateChapter(Chapter e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chapter> getChapterList(int CourseId) {
		Query r;		
			r = em.createQuery("select x from chapter x where courseid =: id ");
	    	r.setParameter("id", CourseId);
	    	List<Chapter> CoursesList = (List<Chapter>) r.getResultList();	
		return CoursesList;
	}

	@Override
	public Chapter getChapterById(int Chapterid) {
		// TODO Auto-generated method stub
		return null;
	}

}

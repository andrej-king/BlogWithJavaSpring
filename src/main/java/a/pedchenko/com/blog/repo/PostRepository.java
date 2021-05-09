package a.pedchenko.com.blog.repo;

import a.pedchenko.com.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}

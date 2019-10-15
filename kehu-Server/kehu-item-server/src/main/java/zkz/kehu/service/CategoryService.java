package zkz.kehu.service;

import zkz.kehu.pojo.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> queryCategoriesByPid(Long pid);

    int test_update(Category category);
}

package zkz.item.service;

import zkz.item.pojo.Category;

import java.util.List;

public interface itemCategoryService {

    public List<Category> queryCategoriesByPid(Long pid);

    int test_update(Category category);
}

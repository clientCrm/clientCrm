package zkz.bangong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zkz.bangong.mapper.CategoryMapper;
import zkz.bangong.pojo.Category;
import zkz.bangong.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    /**
     * 根据parentId查询子类目
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoriesByPid(Long pid) {

            Category record = new Category();
            record.setParentId(pid);
            return this.categoryMapper.select(record);
        }
/**
 * create by: zkz
 * description:
 * create time: 12:01 2019/10/13
 * param :
 */
    @Override
    public int test_update(Category category) {
        return this.categoryMapper.updateByPrimaryKey(category);
    }

}

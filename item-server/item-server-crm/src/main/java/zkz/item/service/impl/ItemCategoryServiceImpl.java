package zkz.item.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zkz.item.mapper.itemCategoryMapper;
import zkz.item.pojo.Category;
import zkz.item.service.itemCategoryService;

import java.util.List;

@Service
public class ItemCategoryServiceImpl implements itemCategoryService {
    @Autowired
    private itemCategoryMapper categoryMapper;
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

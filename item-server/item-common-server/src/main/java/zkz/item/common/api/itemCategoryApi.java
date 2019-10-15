package zkz.item.common.api;

import org.springframework.web.bind.annotation.*;
import zkz.item.common.pojo.itemCategory;

import java.util.List;

@RequestMapping("itemCategory")
public interface itemCategoryApi {
    @GetMapping("list")
    List<itemCategory> queryCategoriesByid(@RequestParam("pid") Long pid);

    @GetMapping("hello")
    String test(@RequestParam("id") long id);

    @PostMapping("test_update")
    Integer test_update(@RequestBody itemCategory category);

    @PostMapping("test_update_with_duo")
    Integer test_update_with_duo(@RequestBody itemCategory category, @RequestParam("test") String test, @RequestParam("testId") Integer testId);
}
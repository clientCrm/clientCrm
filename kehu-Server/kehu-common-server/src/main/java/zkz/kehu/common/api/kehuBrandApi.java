package zkz.kehu.common.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import zkz.kehu.common.pojo.kehuBrand;

/**
 * create by: zkz
 * description: 把你微服务的请求api写在这里并且详细备注
 * create time: 21:20 2019/10/11
 * param :
 */
@RequestMapping("kehuBrand")
public interface kehuBrandApi {

    @GetMapping("{id}")
     public kehuBrand queryBrandById(@PathVariable("id") Long id);
}
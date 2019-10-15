package zkz.bangong.common.api.bangong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import zkz.bangong.common.pojo.Brand;

/**
 * create by: zkz
 * description: 把你微服务的请求api写在这里并且详细备注
 * create time: 21:20 2019/10/11
 * param :
 */
@RequestMapping("brand")
public interface BrandApi {

    @GetMapping("{id}")
     public Brand queryBrandById(@PathVariable("id") Long id);
}
package life.zhogjiane.community.service;

import life.zhogjiane.community.mapper.NavMapper;
import life.zhogjiane.community.model.Nav;
import life.zhogjiane.community.model.NavExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 导航服务
 *
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Service
public class NavService {
    @Autowired
    private NavMapper navMapper;

    public List<Nav> list() {
        NavExample navExample = new NavExample();
        navExample.createCriteria()
                .andStatusEqualTo(1);
        navExample.setOrderByClause("priority desc");
        List<Nav> navs = navMapper.selectByExample(navExample);
        return navs;
    }
}

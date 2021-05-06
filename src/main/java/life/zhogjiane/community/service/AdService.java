package life.zhogjiane.community.service;

import life.zhogjiane.community.mapper.AdMapper;
import life.zhogjiane.community.model.Ad;
import life.zhogjiane.community.model.AdExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 广告服务
 * Created by codedrinker on 2019/9/6.
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
@Service
public class AdService {
    @Autowired
    private AdMapper adMapper;

    /**
     * 列表
     *
     * @param pos pos
     * @return {@link List<Ad>}
     */
    public List<Ad> list(String pos) {
        AdExample navExample = new AdExample();
        navExample.createCriteria()
                .andStatusEqualTo(1)
                .andPosEqualTo(pos)
                .andGmtStartLessThan(System.currentTimeMillis())
                .andGmtEndGreaterThan(System.currentTimeMillis());
        return adMapper.selectByExample(navExample);
    }
}

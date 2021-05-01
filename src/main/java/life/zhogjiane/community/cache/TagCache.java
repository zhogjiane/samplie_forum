package life.zhogjiane.community.cache;

import life.zhogjiane.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 标签缓存
 *
 * @author zhogjiane
 * @date 2021/05/01
 */
public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("指数基金");
        program.setTags(Arrays.asList("白酒指数", "鹏华酒指数", "纳斯达克指数", "央企指数", "医药指数", "环保指数", "上证50指数", "沪深300指数", "食品饮料指数", "恒生指数", "汽车指数", "中证500指数", "地产等权指数", "钢铁指数", "红利指数", "蓝筹指数", "标普500指数", "军工指数", "互联网指数", "半导体指数", "国债指数", "有色指数", "中小盘指数", "社会责任指数", "可持续发展指数", "建筑指数", "健康指数", "计算机指数"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("热门股票");
        framework.setTags(Arrays.asList("茅台", "五粮液", "苹果", "微软", "鸿路钢建", "太阳纸业", "中国平安", "招商银行", "招商积余", "完美世界"));
        tagDTOS.add(framework);


        TagDTO server = new TagDTO();
        server.setCategoryName("债券");
        server.setTags(Arrays.asList("信用债券", "回报债券", "增长债券", "产业债券", "国家债券", "双责债券", "高回报债", "亚债", "双息债", "银行债", "国债"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("货币");
        db.setTags(Arrays.asList("交易型货币", "收益宝货币", "余额宝货币", "可转债货币", "指数货币", "添益货币", "通宝货币", "福利货币", "银行货币"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("新发基金");
        tool.setTags(Arrays.asList("价值混合", "蓝筹", "酒类", "建筑", "银行", "农业", "贵金属", "纸黄金", "指数混合", "林业混合", "消费混合", "周期混合", "境外混合", "低碳混合"));
        tagDTOS.add(tool);
        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) || !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }

    public static void main(String[] args) {
        int i = (5 - 1) >>> 1;
        System.out.println(i);
    }
}

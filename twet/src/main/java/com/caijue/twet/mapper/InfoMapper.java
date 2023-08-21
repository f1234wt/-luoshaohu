package com.caijue.twet.mapper;

import com.caijue.twet.pojo.Info;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caijue.twet.util.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【twet_info(特卫信息表)】的数据库操作Mapper
* @createDate 2023-08-02 16:58:20
* @Entity com.caijue.twet.pojo.Info
*/
public interface InfoMapper extends BaseMapper<Info> {

    public List<Score> score(@Param("result") Long result, @Param("orderStatus") String orderStatus, @Param("tId")Long tId);
}





package scu.debate.dao.DAO;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSException;
import scu.debate.dao.entity.Arguement;

import java.util.List;

@Repository
public interface ArguementDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Arguement record);

    int insertSelective(Arguement record);

    Arguement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Arguement record);

    int updateByPrimaryKey(Arguement record);

    Arguement queryArguementDOLimit1(Arguement arguement);

    List<Arguement> queryAllByCategory(String category);

    List<Arguement> queryAll();

    @Select("select * from arguement where " +
            "id >= ((select MAX(id) FROM arguement) * RAND()) LIMIT 1")
    Arguement selectOneRandomArgument();

    @Select("select * from arguement where category = #{category} and " +
            "id >= ((select MAX(id) FROM (select * from arguement where category = #{category}) as tab) * RAND()) LIMIT 1")
    Arguement selectOneRandomArgumentByCategory(String category);
}